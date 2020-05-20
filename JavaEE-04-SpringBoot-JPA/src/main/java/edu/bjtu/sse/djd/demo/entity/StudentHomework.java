package edu.bjtu.sse.djd.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author 董金达
 * @version 1.0
 * @name StudentHomework
 * @date 2020/5/19 20:42
 **/
@Data
@Entity
@Table(name = "s_student_homework")
public class StudentHomework {

    @Id
    private Long id;

    private Long studentId;

    private Long homeworkId;

    private String homeworkTitle;

    private String homeworkContent;

    private Date createTime;

    private Date updateTime;

}
