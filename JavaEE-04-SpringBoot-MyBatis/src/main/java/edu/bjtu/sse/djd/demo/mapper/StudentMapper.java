package edu.bjtu.sse.djd.demo.mapper;

import edu.bjtu.sse.djd.demo.model.Student;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name StudentMapper
 * @date 2020/5/23 10:56
 **/

public interface StudentMapper {

    /**
     * 返回 s_student 表中所有数据
     * @author 董金达
     * @date 10:57 2020/5/23
     * @param
     * @return java.util.List<edu.bjtu.sse.djd.demo.model.Homework>
     **/
    List<Student> findAll();

}
