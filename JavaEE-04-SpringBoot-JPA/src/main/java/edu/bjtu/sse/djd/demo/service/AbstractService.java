package edu.bjtu.sse.djd.demo.service;

import edu.bjtu.sse.djd.demo.entity.Homework;
import edu.bjtu.sse.djd.demo.repository.AbstractRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name AbstractService
 * @date 2020/5/20 22:51
 **/
public abstract class AbstractService<E, PK> {

    /**
     * 抽象方法 获取 repository
     * @author 董金达
     * @date 23:01 2020/5/20
     * @param
     * @return edu.bjtu.sse.djd.demo.service.AbstractService<E, PK>
     **/
    protected abstract AbstractRepository<E, PK> getRepository();

    
    /**
     * 基本 findAll(), 返回所有数据
     * @author 董金达
     * @date 23:15 2020/5/20
     * @param 
     * @return java.util.List<E>
     **/
    public List<E> findAll(){
        return getRepository().findAll();
    }

    /**
     * Pageable 分页实现
     * @author 董金达
     * @date 23:16 2020/5/20
     * @param page
     * @param size
     * @return org.springframework.data.domain.Page<E>
     **/
    public Page<E> findAll(int page, int size){

//        Pageable pageable = PageRequest.of(page, size);

//        Page<E> ePage = getRepository().findAll(pageable);

        return getRepository().findAll(PageRequest.of(page, size));
    }


    /**
     * Pageable & Query by Example (QBE) 精准查找实现
     * @author 董金达
     * @date 23:17 2020/5/20
     * @param example
     * @param page
     * @param size
     * @return org.springframework.data.domain.Page<E>
     **/
    public Page<E> findAll(Example<E> example, int page, int size){

//        Pageable pageable = PageRequest.of(page, size);

//        Page<E> ePage = getRepository().findAll(pageable);

        return getRepository().findAll(example, PageRequest.of(page, size));
    }


    /**
     * Pageable & Query by Specification 实现过滤功能
     * @author 董金达
     * @date 23:17 2020/5/20
     * @param specification
     * @param page
     * @param size
     * @return org.springframework.data.domain.Page<E>
     **/
    public Page<E> findAll(Specification<E> specification, int page, int size){

//        Pageable pageable = PageRequest.of(page, size);

//        Page<Homework> ePage = getRepository().findAll(specification, PageRequest.of(page, size));

        return getRepository().findAll(specification, PageRequest.of(page, size));
    }


}
