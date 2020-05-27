package edu.bjtu.sse.djd.demo.mapper;

import edu.bjtu.sse.djd.demo.model.Homework;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name HomeworkMapper
 * @date 2020/5/22 20:23
 **/

public interface HomeworkMapper {

    /**
     * 返回表中所有数据
     * @author 董金达
     * @date 20:23 2020/5/22
     * @param
     * @return java.util.List<edu.bjtu.sse.djd.demo.model.Homework>
     **/
    List<Homework> findAll();

    /**
     * 向 s_homework 表中插入一条数据
     * @author 董金达
     * @date 17:04 2020/5/23
     * @param
     * @param homework
     **/
    void addHomework(Homework homework);

    /**
     * 删除 s_homework 表中指定一条数据
     * @author 董金达
     * @date 17:53 2020/5/23
     * @param
     * @param homework
     * @return void
     **/
    void  deleteHomework(Homework homework);

    /**
     * 更新 s_homework 表中指定一条数据
     * @author 董金达
     * @date 18:20 2020/5/23
     * @param
     * @param homework
     * @return void
     **/
    void updateHomework(Homework homework);

}
