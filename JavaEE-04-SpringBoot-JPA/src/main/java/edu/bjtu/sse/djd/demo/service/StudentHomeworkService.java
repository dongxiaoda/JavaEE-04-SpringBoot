package edu.bjtu.sse.djd.demo.service;

import edu.bjtu.sse.djd.demo.entity.StudentHomework;
import edu.bjtu.sse.djd.demo.repository.StudentHomeworkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name StudentHomeworkService
 * @date 2020/5/19 21:30
 **/

@Service
public class StudentHomeworkService extends BaseService<StudentHomework, Long, StudentHomeworkRepository> {

//    private final StudentHomeworkRepository studentHomeworkRepository;

//    public StudentHomeworkService(StudentHomeworkRepository studentHomeworkRepository) {
//        this.studentHomeworkRepository = studentHomeworkRepository;
//    }

//    public List<StudentHomework> findAll(){
//        return studentHomeworkRepository.findAll();
//    }
}
