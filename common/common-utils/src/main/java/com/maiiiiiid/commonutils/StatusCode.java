package com.maiiiiiid.commonutils;

/**
 * @ClassName com.maiiiiiid.commonutils.ResultCode
 * @Description
 * @Author Maid
 * @Date 2020/10/25 0025 13:11
 * @Version v1.0
 */
public interface StatusCode {
	//成功
	public static final int OK = 20000;
	//失败
	public static final int ERROR = 20001;
	//用户名或密码错误
	public static final int LOGINERROR = 20002;
	//权限不足
	public static final int ACCESSERROR = 20003;
	//远程调用失败
	public static final int REMOTEERROR = 20004;
	//重复操作
	public static final int REPERROR = 20005;
	//没有对应的抢购数据
	public static final int NOTFOUNDERROR = 20006;
}
