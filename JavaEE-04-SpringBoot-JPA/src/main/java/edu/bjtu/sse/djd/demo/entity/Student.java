package edu.bjtu.sse.djd.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author 董金达
 * @version 1.0
 * @name Student
 * @date 2020/5/19 20:41
 **/
@Data
@Entity
@Table(name = "s_student")
public class Student {

    @Id
    private Long id;

    private String name;

    private Date createTime;

    private Date updateTime;

}
