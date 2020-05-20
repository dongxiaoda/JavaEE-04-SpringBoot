package edu.bjtu.sse.djd.demo.controller;

import edu.bjtu.sse.djd.demo.core.request.HomeworkPageRequest;
import edu.bjtu.sse.djd.demo.core.response.DataResponse;
import edu.bjtu.sse.djd.demo.core.response.PageResponse;
import edu.bjtu.sse.djd.demo.entity.Homework;
import edu.bjtu.sse.djd.demo.service.HomeworkService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name HomeworkController
 * @date 2020/5/19 21:43
 **/

@Controller(value = "HomeworkTeacher" )
@RequestMapping(value = "/HomeworkTeacher")
public class HomeworkController {

    private final HomeworkService homeworkService;

    public HomeworkController(HomeworkService homeworkService) {
        this.homeworkService = homeworkService;
    }

    /**
     * 添加一条 Homework 记录
     * @author 董金达
     * @date 23:35 2020/5/20
     * @param homework
     * @return void
     **/
    @RequestMapping(value = "/addHomework", method = RequestMethod.POST)
    public void addHomework(@RequestBody Homework homework){
        homeworkService.getRepository().save(homework);
    }

    /**
     * @author 董金达
     * @date 22:21 2020/5/20
     * @description findAll() 返回所有数据
     * @param
     * @return edu.bjtu.sse.djd.demo.core.response.DataResponse<java.util.List < edu.bjtu.sse.djd.demo.entity.Homework>>
     **/
    @RequestMapping(value = "/findAllHomeworkTeacher", method = RequestMethod.GET)
    @ResponseBody
    public DataResponse<List<Homework>> findAllHomeworkTeacher(){

        DataResponse<List<Homework>> dataResponse = new DataResponse<>();

        List<Homework> homeworkList =  homeworkService.findAll();

        dataResponse.setData(homeworkList);

        return dataResponse;
    }

    /**
     * @author 董金达
     * @date 18:22 2020/5/20
     * @description Pageable 实现分页功能
     * @param homeworkPageRequest
     * @return edu.bjtu.sse.djd.demo.core.response.DataResponse<java.util.List < edu.bjtu.sse.djd.demo.entity.Homework>>
     **/
    @RequestMapping(value = "/findAllHomeworkTeacherPage", method = RequestMethod.POST)
    @ResponseBody
    public PageResponse<Homework> findAllHomeworkTeacherPage(@RequestBody HomeworkPageRequest homeworkPageRequest){

        int page = homeworkPageRequest.getPage(), size = homeworkPageRequest.getSize();

        PageResponse<Homework> pageResponse = new PageResponse<>();

        Page<Homework> homeworkList =  homeworkService.findAll(page, size);

        pageResponse.setData(homeworkList.getContent());
        pageResponse.setTotal(homeworkList.getTotalElements());

        return pageResponse;
    }

    /**
     * @author 董金达
     * @date 18:57 2020/5/20
     * @description Pageable & Query by Example (QBE) 实现精准查找
     * @param homeworkPageRequest
     * @return edu.bjtu.sse.djd.demo.core.response.PageResponse<edu.bjtu.sse.djd.demo.entity.Homework>
     **/
    @RequestMapping(value = "/findAllHomeworkTeacherPageByExample", method = RequestMethod.POST)
    @ResponseBody
    public PageResponse<Homework> findAllHomeworkTeacherPageByExample(@RequestBody HomeworkPageRequest homeworkPageRequest){

        int page = homeworkPageRequest.getPage(), size = homeworkPageRequest.getSize();

        PageResponse<Homework> pageResponse = new PageResponse<>();

        Homework homework = Homework.builder().id(homeworkPageRequest.getId()).build();

        Example<Homework> example = Example.of(homework);

        Page<Homework> homeworkList =  homeworkService.findAll(example, page, size);

        pageResponse.setData(homeworkList.getContent());
        pageResponse.setTotal(homeworkList.getTotalElements());

        return pageResponse;
    }

    /**
     * @author 董金达
     * @date 22:45 2020/5/20
     * @description Pageable & Query by Specification 实现过滤
     * @param homeworkPageRequest
     * @return edu.bjtu.sse.djd.demo.core.response.PageResponse<edu.bjtu.sse.djd.demo.entity.Homework>
     **/
    @RequestMapping(value = "/findAllHomeworkTeacherPageBySpecification", method = RequestMethod.POST)
    @ResponseBody
    public PageResponse<Homework> findAllHomeworkTeacherPageBySpecification(@RequestBody HomeworkPageRequest homeworkPageRequest){

        int page = homeworkPageRequest.getPage(), size = homeworkPageRequest.getSize();

        PageResponse<Homework> pageResponse = new PageResponse<>();

//        Homework homework = Homework.builder().id(homeworkPageRequest.getId()).build();

        Specification<Homework> specification = new Specification<Homework>() {
            @Override
            public Predicate toPredicate(Root<Homework> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                List<Predicate> predicateList = new ArrayList<>();

                Predicate homeworkPredicate = criteriaBuilder.greaterThan(root.get("id"), homeworkPageRequest.getId());

                predicateList.add(homeworkPredicate);

                criteriaQuery.orderBy(criteriaBuilder.desc(root.get("id")));

                Predicate[] predicates = new Predicate[predicateList.size()];

                return criteriaBuilder.and(predicateList.toArray(predicates));
            }
        };

        Page<Homework> homeworkList =  homeworkService.findAll(specification, page, size);

        pageResponse.setData(homeworkList.getContent());
        pageResponse.setTotal(homeworkList.getTotalElements());

        return pageResponse;
    }

}
