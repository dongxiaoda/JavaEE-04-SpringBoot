package edu.bjtu.sse.djd.demo.controller;

import edu.bjtu.sse.djd.demo.entity.StudentHomework;
import edu.bjtu.sse.djd.demo.service.StudentHomeworkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name HomeworkHomeworkController
 * @date 2020/5/19 23:20
 **/

@Controller
public class StudentHomeworkController {

    private final StudentHomeworkService studentHomeworkService;

    public StudentHomeworkController(StudentHomeworkService studentHomeworkService) {
        this.studentHomeworkService = studentHomeworkService;
    }

    @RequestMapping(value = "/findAllStudentHomework", method = RequestMethod.GET)
    @ResponseBody
    public List<StudentHomework> findAllStudentHomework(){
        return studentHomeworkService.findAll();
    }
}
