package edu.bjtu.sse.djd.demo.service;

import edu.bjtu.sse.djd.demo.entity.Homework;
import edu.bjtu.sse.djd.demo.repository.HomeworkRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name HomeworkService
 * @date 2020/5/19 21:29
 **/

@Service
public class HomeworkService extends BaseService<Homework, Long, HomeworkRepository> {

//    private final HomeworkRepository homeworkRepository;

//    public HomeworkService(HomeworkRepository homeworkRepository) {
//        this.homeworkRepository = homeworkRepository;
//    }


    /*
     * @author 董金达
     * @date 22:17 2020/5/20
     * @description 基本 findAll(), 返回所有数据
     * @param
     * @return java.util.List<edu.bjtu.sse.djd.demo.entity.Homework>
     **/
//    public List<Homework> findAll(){
//        return homeworkRepository.findAll();
//    }

    /*
     * @author 董金达
     * @date 22:18 2020/5/20
     * @description Pageable 分页实现
     * @param page
     * @param size
     * @return org.springframework.data.domain.Page<edu.bjtu.sse.djd.demo.entity.Homework>
     **/
//    public Page<Homework> findAll(int page, int size){
//
////        Pageable pageable = PageRequest.of(page, size);
//
//        return homeworkRepository.findAll(PageRequest.of(page, size));
//    }

    /*
     * @author 董金达
     * @date 18:50 2020/5/20
     * @description Pageable & Query by Example (QBE) 精准查找实现
     * @param example
     * @param page
     * @param size
     * @return org.springframework.data.domain.Page<edu.bjtu.sse.djd.demo.entity.Homework>
     **/
//    public Page<Homework> findAll(Example<Homework> example, int page, int size){
//
////        Pageable pageable = PageRequest.of(page, size);
//
//        return homeworkRepository.findAll(example, PageRequest.of(page, size));
//    }


    /*
     * @author 董金达
     * @date 22:08 2020/5/20
     * @description Pageable & Query by Specification 实现过滤功能
     * @param specification
     * @param page
     * @param size
     * @return org.springframework.data.domain.Page<edu.bjtu.sse.djd.demo.entity.Homework>
     **/
//    public Page<Homework> findAll(Specification<Homework> specification, int page, int size){
//
////        Pageable pageable = PageRequest.of(page, size);
//
////        Page<Homework> homeworkPage = homeworkRepository.findAll(specification, PageRequest.of(page, size));
//
//        return homeworkRepository.findAll(specification, PageRequest.of(page, size));
//    }

}
