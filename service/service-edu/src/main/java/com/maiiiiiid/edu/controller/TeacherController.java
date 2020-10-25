package com.maiiiiiid.edu.controller;


import com.maiiiiiid.commonutils.Result;
import com.maiiiiiid.commonutils.StatusCode;
import com.maiiiiiid.edu.entity.Teacher;
import com.maiiiiiid.edu.service.ITeacherService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
	@ApiOperation(value = "所有讲师列表")
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
	@ApiOperation(value = "根据ID删除讲师")
	@DeleteMapping("delete/{id}")
	public Result removeTeacher(
			@ApiParam(name = "id", value = "讲师ID", required = true)
			@PathVariable("id")Integer id) {
		boolean success = iTeacherService.removeById(id);
		return new Result(true,StatusCode.OK,"删除ID为" + id + "的讲师成功!") ;
	}
}
