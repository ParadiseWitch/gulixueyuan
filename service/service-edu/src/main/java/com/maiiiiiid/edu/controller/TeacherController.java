package com.maiiiiiid.edu.controller;


import com.maiiiiiid.commonutils.Result;
import com.maiiiiiid.commonutils.StatusCode;
import com.maiiiiiid.edu.entity.Teacher;
import com.maiiiiiid.edu.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
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
	public Result<List<Teacher>> findAllTeacher() {
		List<Teacher> teachers = iTeacherService.list();
		return new Result<List<Teacher>>(true,StatusCode.OK,"查询所有讲师成功!",teachers);
	}

	/**
	 * 逻辑删除讲师
	 * @param id
	 * @return
	 */
	@DeleteMapping("delete/{id}")
	public Result removeTeacher(@PathVariable("id")Integer id) {
		boolean success = iTeacherService.removeById(id);
		return new Result(true,StatusCode.OK,"删除ID为" + id + "的讲师成功!") ;
	}
}
