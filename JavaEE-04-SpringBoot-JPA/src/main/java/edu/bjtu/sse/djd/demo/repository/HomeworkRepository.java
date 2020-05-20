package edu.bjtu.sse.djd.demo.repository;

import edu.bjtu.sse.djd.demo.entity.Homework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author 董金达
 * @version 1.0
 * @name HomeworkRepository
 * @date 2020/5/19 21:05
 **/

public interface HomeworkRepository extends AbstractRepository<Homework, Long> {

}
