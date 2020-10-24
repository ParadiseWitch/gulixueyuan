package com.maiiiiiid.edu.controller;


import com.maiiiiiid.edu.entity.Teacher;
import com.maiiiiiid.edu.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	/**
	 * 查询所有导师
	 * @return
	 */
	@GetMapping("findAll")
	public List<Teacher> findAllTeacher() {
		return iTeacherService.list();
	}

	/**
	 * 逻辑删除讲师
	 * @param id
	 * @return
	 */
	@DeleteMapping("{id}")
	public boolean removeTeacher(@PathVariable("id")Integer id) {
		return iTeacherService.removeById(id);
	}
}
