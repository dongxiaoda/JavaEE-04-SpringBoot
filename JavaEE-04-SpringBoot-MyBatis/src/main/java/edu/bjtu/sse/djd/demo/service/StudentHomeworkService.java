package edu.bjtu.sse.djd.demo.service;

import edu.bjtu.sse.djd.demo.mapper.StudentHomeworkMapper;
import edu.bjtu.sse.djd.demo.model.StudentHomework;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name StudentHomeworkService
 * @date 2020/5/23 11:26
 **/

@Service
public class StudentHomeworkService {

    private final StudentHomeworkMapper studentHomeworkMapper;

    public StudentHomeworkService(StudentHomeworkMapper studentHomeworkMapper) {
        this.studentHomeworkMapper = studentHomeworkMapper;
    }

    /**
     * 通过 mapper 获取 s_student_homework 表中所有数据
     * @author 董金达
     * @date 11:28 2020/5/23
     * @param
     * @return java.util.List<edu.bjtu.sse.djd.demo.model.StudentHomework>
     **/
    public List<StudentHomework> findAll(){
        return studentHomeworkMapper.findAll();
    }
}
