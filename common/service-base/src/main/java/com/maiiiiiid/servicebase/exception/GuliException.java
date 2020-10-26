package com.maiiiiiid.servicebase.exception;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName com.maiiiiiid.servicebase.exception.GuliException
 * @Description
 * @Author Maid
 * @Date 2020/10/26 0026 11:33
 * @Version v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuliException extends RuntimeException{
	@ApiModelProperty(value = "状态码")
	private Integer code;

	private String msg;
}
