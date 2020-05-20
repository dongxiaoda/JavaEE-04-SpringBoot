package edu.bjtu.sse.djd.demo.repository;

import edu.bjtu.sse.djd.demo.entity.Homework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author 董金达
 * @version 1.0
 * @name AbstractRepository
 * @date 2020/5/20 22:56
 **/

@NoRepositoryBean
public interface AbstractRepository<E, PK> extends JpaRepository<E, PK>, JpaSpecificationExecutor<E> {
}
