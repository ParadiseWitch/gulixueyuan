package com.maiiiiiid.edu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName com.maiiiiiid.edu.config.EduConfig
 * @Description
 * @Author Maid
 * @Date 2020/10/23 0023 20:41
 * @Version v1.0
 */
@Configuration
@MapperScan("com.maiiiiiid.edu.mapper")
public class EduConfig {

}
