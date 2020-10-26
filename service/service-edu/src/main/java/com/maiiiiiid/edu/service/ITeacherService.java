package com.maiiiiiid.edu.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.maiiiiiid.edu.entity.Teacher;
import com.maiiiiiid.edu.query.TeacherQuery;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author maiiiiiid
 * @since 2020-10-23
 */
public interface ITeacherService extends IService<Teacher> {
	void pageQuery(Page<Teacher> pageParam, TeacherQuery teacherQuery);
}
