package edu.bjtu.sse.djd.demo.model;

import lombok.Data;

import java.util.Date;

/**
 * @author 董金达
 * @version 1.0
 * @name Student
 * @date 2020/5/22 16:56
 **/
@Data
public class Student {

    private Long id;

    private String name;

    private Date createTime;

    private Date updateTime;

}
