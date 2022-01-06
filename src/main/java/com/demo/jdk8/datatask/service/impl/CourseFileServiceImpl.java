package com.demo.jdk8.datatask.service.impl;

import com.demo.jdk8.datatask.entity.CourseFile;
import com.demo.jdk8.datatask.mapper.CourseFileMapper;
import com.demo.jdk8.datatask.service.ICourseFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author myk
*/
@Service("ICourseFileService")
    public class CourseFileServiceImpl extends ServiceImpl<CourseFileMapper, CourseFile> implements ICourseFileService {

    }
