package com.demo.jdk8.datatask.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author myk
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CourseFile implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 课程文档的路径
     */
    private String path;
    /**
     * 所属课程
     */
    private Integer courseId;
    /**
     * 上传时间
     */
    private LocalDateTime recordTime;
    /**
     * 所属教师
     */
    private Integer teacherId;
    private String state;
    @TableField("isDel")
    private Integer isdel;


}
