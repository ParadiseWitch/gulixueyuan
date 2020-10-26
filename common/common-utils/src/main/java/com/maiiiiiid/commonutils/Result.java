package com.maiiiiiid.commonutils;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName com.maiiiiiid.commonutils.Result
 * @Description
 * @Author Maid
 * @Date 2020/10/25 0025 13:14
 * @Version v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Result<T> {
	@NonNull
	@ApiModelProperty(value = "是否成功")
	private Boolean success;

	@NonNull
	@ApiModelProperty(value = "返回码")
	private Integer code;

	@NonNull
	@ApiModelProperty(value = "返回消息")
	private String message;

	@ApiModelProperty(value = "返回数据")
	private T data;

	public Result ok(String message){
		this.setSuccess(true);
		this.setCode(StatusCode.OK);
		this.setMessage(message);
		return this;
	}

	public Result error(String message){
		this.setSuccess(false);
		this.setCode(StatusCode.ERROR);
		this.setMessage(message);
		return this;
	}
}
