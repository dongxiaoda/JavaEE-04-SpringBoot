package edu.bjtu.sse.djd.demo.service;

import edu.bjtu.sse.djd.demo.mapper.StudentMapper;
import edu.bjtu.sse.djd.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name StudentService
 * @date 2020/5/23 10:58
 **/

@Service
public class StudentService {
    private final StudentMapper studentMapper;

    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    /**
     * 获取 s_student 表中所有数据
     * @author 董金达
     * @date 11:02 2020/5/23
     * @param
     * @return java.util.List<edu.bjtu.sse.djd.demo.model.Student>
     **/
    public List<Student> findAll(){
        return studentMapper.findAll();
    }

}
