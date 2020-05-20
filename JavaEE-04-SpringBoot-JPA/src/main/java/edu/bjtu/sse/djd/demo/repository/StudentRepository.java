package edu.bjtu.sse.djd.demo.repository;

import edu.bjtu.sse.djd.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 董金达
 * @version 1.0
 * @name StudentRepository
 * @date 2020/5/19 21:04
 **/

public interface StudentRepository extends AbstractRepository<Student, Long> {

}
