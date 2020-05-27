package edu.bjtu.sse.djd.demo.controller;

import edu.bjtu.sse.djd.demo.model.Homework;
import edu.bjtu.sse.djd.demo.response.ListResponse;
import edu.bjtu.sse.djd.demo.service.HomeworkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 董金达
 * @version 1.0
 * @name HomeworkController
 * @date 2020/5/22 20:34
 **/

@Controller
@RequestMapping(value = "Homework")
public class HomeworkController {

    private final HomeworkService homeworkService;

    public HomeworkController(HomeworkService homeworkService) {
        this.homeworkService = homeworkService;
    }

    /**
     * 返回 s_homework 表中所有数据
     * @author 董金达
     * @date 21:11 2020/5/22
     * @param
     * @return edu.bjtu.sse.djd.demo.response.ListResponse<edu.bjtu.sse.djd.demo.model.Homework>
     **/
    @ResponseBody
    @RequestMapping(value = "findAllHomework", method = RequestMethod.GET)
    public ListResponse<Homework> findAll(){

        ListResponse<Homework> listResponse = new ListResponse<Homework>();
        listResponse.setData(homeworkService.findAll());

        return listResponse;
    }

    /**
     * 向 s_homework 中插入一条数据
     * @author 董金达
     * @date 17:35 2020/5/23
     * @param
     * @param homework
     * @return void
     **/
    @ResponseBody
    @RequestMapping(value = "addHomework", method = RequestMethod.POST)
    public void addHomework(@RequestBody Homework homework){
        homeworkService.addHomework(homework);
    }

    /**
     * 删除 s_homework 表中指定一条数据
     * @author 董金达
     * @date 17:55 2020/5/23
     * @param
     * @param homework
     * @return void
     **/
    @ResponseBody
    @RequestMapping(value = "deleteHomework", method = RequestMethod.POST)
    public void deleteHomework(@RequestBody Homework homework){
        homeworkService.deleteHomework(homework);
    }

    /**
     * 更新 s_homework 表中指定一条数据
     * @author 董金达
     * @date 18:23 2020/5/23
     * @param
     * @param homework
     * @return void
     **/
    @ResponseBody
    @RequestMapping(value = "updateHomework", method = RequestMethod.POST)
    public void updateHomework(@RequestBody Homework homework){
        homeworkService.updateHomework(homework);
    }
}
