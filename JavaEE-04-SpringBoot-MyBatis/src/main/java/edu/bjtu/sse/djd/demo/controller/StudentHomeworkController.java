package edu.bjtu.sse.djd.demo.controller;

import edu.bjtu.sse.djd.demo.model.StudentHomework;
import edu.bjtu.sse.djd.demo.response.ListResponse;
import edu.bjtu.sse.djd.demo.service.StudentHomeworkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 董金达
 * @version 1.0
 * @name StudentHomeworkController
 * @date 2020/5/23 11:28
 **/

@Controller
@RequestMapping(value = "/StudentHomework")
public class StudentHomeworkController {

    private final StudentHomeworkService studentHomeworkService;

    public StudentHomeworkController(StudentHomeworkService studentHomeworkService){
        this.studentHomeworkService = studentHomeworkService;
    }

    /**
     * 通过 service 获取 s_student_homework 表中所有数据
     * @author 董金达
     * @date 11:31 2020/5/23
     * @param
     * @return edu.bjtu.sse.djd.demo.response.ListResponse<edu.bjtu.sse.djd.demo.model.StudentHomework>
     **/
    @ResponseBody
    @RequestMapping(value = "/findAllStudentHomework", method = RequestMethod.GET)
    public ListResponse<StudentHomework> findAll(){
        ListResponse<StudentHomework> listResponse = new ListResponse<>();
        listResponse.setData(studentHomeworkService.findAll());
        return listResponse;
    }
}
