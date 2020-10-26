package com.maiiiiiid.servicebase.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName com.maiiiiiid.servicebase.handler.MyMetaObjectHandler
 * @Description
 * @Author Maid
 * @Date 2020/10/26 0026 10:14
 * @Version v1.0
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(MyMetaObjectHandler.class);

	@Override
	public void insertFill(MetaObject metaObject) {
		LOGGER.info("start insert fill ....");
		this.setFieldValByName("gmtCreate",new Date(),metaObject);
		this.setFieldValByName("gmtModified",new Date(),metaObject);
	}

	@Override
	public void updateFill(MetaObject metaObject) {
		this.setFieldValByName("gmtModified",new Date(),metaObject);
	}
}
