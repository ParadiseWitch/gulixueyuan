package com.maiiiiiid.commonutils;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

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

}