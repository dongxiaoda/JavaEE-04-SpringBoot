package edu.bjtu.sse.djd.demo.mapper;

import edu.bjtu.sse.djd.demo.model.StudentHomework;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name StudentHomework
 * @date 2020/5/23 11:23
 **/

public interface StudentHomeworkMapper {

    /**
     * 返回 s_student_homework 表中所有数据
     * @author 董金达
     * @date 11:25 2020/5/23
     * @param
     * @return java.util.List<edu.bjtu.sse.djd.demo.model.StudentHomework>
     **/
    List<StudentHomework> findAll();
}
