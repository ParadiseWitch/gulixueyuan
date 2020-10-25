package com.maiiiiiid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName com.maiiiiiid.TeacherApplication
 * @Description
 * @Author Maid
 * @Date 2020/10/23 0023 20:38
 * @Version v1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.maiiiiiid"})
public class EduApplication {
	public static void main(String[] args) {
		SpringApplication.run(EduApplication.class,args);
	}
}
