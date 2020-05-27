package edu.bjtu.sse.djd.demo.service;

import edu.bjtu.sse.djd.demo.mapper.HomeworkMapper;
import edu.bjtu.sse.djd.demo.model.Homework;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name HomeworkService
 * @date 2020/5/22 20:35
 **/

@Service
public class HomeworkService {

    private final HomeworkMapper homeworkMapper;

    public HomeworkService(HomeworkMapper homeworkMapper) {
        this.homeworkMapper = homeworkMapper;
    }

    /**
     * 获取表中所有数据
     * @author 董金达
     * @date 21:06 2020/5/22
     * @param
     * @return java.util.List<edu.bjtu.sse.djd.demo.model.Homework>
     **/
    public List<Homework> findAll(){
        return homeworkMapper.findAll();
    }

    /**
     * 向 s_homework 插入一条数据
     * @author 董金达
     * @date 17:05 2020/5/23
     * @param
     * @param homework
     * @return void
     **/
    public void addHomework(Homework homework){
        homeworkMapper.addHomework(homework);
    }

    /**
     * 删除 s_homework 表中指定一条数据
     * @author 董金达
     * @date 17:54 2020/5/23
     * @param
     * @param homework
     * @return void
     **/
    public void deleteHomework(Homework homework){
        homeworkMapper.deleteHomework(homework);
    }

    /**
     * 更新 s_homework 表中指定一条数据
     * @author 董金达
     * @date 18:21 2020/5/23
     * @param
     * @param homework
     * @return void
     **/
    public void updateHomework(Homework homework){
        homeworkMapper.updateHomework(homework);
    }
}
