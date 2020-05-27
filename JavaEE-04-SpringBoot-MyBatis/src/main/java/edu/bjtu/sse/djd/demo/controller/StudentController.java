package edu.bjtu.sse.djd.demo.controller;

import edu.bjtu.sse.djd.demo.model.Student;
import edu.bjtu.sse.djd.demo.response.ListResponse;
import edu.bjtu.sse.djd.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name StudentController
 * @date 2020/5/23 11:03
 **/

@Controller
@RequestMapping(value = "/Student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * 通过 service 层获取表中数据，以 ListResponse 格式返回
     * @author 董金达
     * @date 11:09 2020/5/23
     * @param
     * @return edu.bjtu.sse.djd.demo.response.ListResponse<edu.bjtu.sse.djd.demo.model.Student>
     **/
    @ResponseBody
    @RequestMapping(value = "/findAllStudent", method = RequestMethod.GET)
    public ListResponse<Student> findAll(){
        List<Student> studentList = studentService.findAll();
        ListResponse<Student> listResponse = new ListResponse<>();
        listResponse.setData(studentList);
        return listResponse;
    }
}
