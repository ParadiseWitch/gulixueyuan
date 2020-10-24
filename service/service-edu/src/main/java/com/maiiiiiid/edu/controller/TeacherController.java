package com.maiiiiiid.edu.controller;


import com.maiiiiiid.edu.entity.Teacher;
import com.maiiiiiid.edu.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author maiiiiiid
 * @since 2020-10-23
 */
@RestController
@RequestMapping("/edu/teacher")
public class TeacherController {

	@Autowired
	private ITeacherService iTeacherService;

	@GetMapping("findAll")
	public List<Teacher> findAllTeacher() {
		return iTeacherService.list();
	}
}
