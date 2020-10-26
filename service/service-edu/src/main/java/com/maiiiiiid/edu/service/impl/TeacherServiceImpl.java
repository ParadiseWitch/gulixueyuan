package com.maiiiiiid.edu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maiiiiiid.edu.entity.Teacher;
import com.maiiiiiid.edu.mapper.TeacherMapper;
import com.maiiiiiid.edu.query.TeacherQuery;
import com.maiiiiiid.edu.service.ITeacherService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Queue;

/**
 * <p>
 * 讲师 服务实现类
 * </p>
 *
 * @author maiiiiiid
 * @since 2020-10-23
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

	@Override
	public void pageQuery(Page<Teacher> pageParam, TeacherQuery teacherQuery) {
		QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
		queryWrapper.orderByDesc("sort");
		if(teacherQuery == null){
			baseMapper.selectPage(pageParam,queryWrapper);
			return;
		}
		String name = teacherQuery.getName();
		Integer level = teacherQuery.getLevel();
		String start = teacherQuery.getStart();
		String end = teacherQuery.getEnd();

		if (!StringUtils.isEmpty(name)){
			queryWrapper.like("name",name);
		}
		if (!StringUtils.isEmpty(level)){
			queryWrapper.eq("level",level);
		}
		if (!StringUtils.isEmpty(start)){
			queryWrapper.ge("gmt_create",start);
		}
		if (!StringUtils.isEmpty(end)){
			queryWrapper.le("gmt_modified",end);
		}
		baseMapper.selectPage(pageParam,queryWrapper);
	}
}
