package com.maiiiiiid.servicebase.handler;

import com.maiiiiiid.commonutils.Result;
import com.maiiiiiid.commonutils.StatusCode;
import com.maiiiiiid.commonutils.util.ExceptionUtil;
import com.maiiiiiid.servicebase.exception.GuliException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName com.maiiiiiid.servicebase.handler.GlobalExceptionHandler
 * @Description
 * @Author Maid
 * @Date 2020/10/26 0026 11:21
 * @Version v1.0
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler  {
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Result error(Exception e){
		e.printStackTrace();
		return new Result().error(e.toString());
	}

	@ExceptionHandler(ArithmeticException .class)
	@ResponseBody
	public Result error(ArithmeticException  e){
		e.printStackTrace();
		return new Result().error("算术异常:\n " + e.toString());
	}

	@ExceptionHandler(GuliException.class)
	@ResponseBody
	public Result error(GuliException e){
		log.error(ExceptionUtil.getMessage(e));
		e.printStackTrace();
		return new Result(false, e.getCode(),e.getMsg());
	}



}
