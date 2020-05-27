package edu.bjtu.sse.djd.demo.model;

import lombok.Data;

import java.util.Date;

/**
 * @author 董金达
 * @version 1.0
 * @name StudentHomework
 * @date 2020/5/22 16:57
 **/
@Data
public class StudentHomework {

    private Long id;

    private Long studentId;

    private Long homeworkId;

    private String homeworkTitle;

    private String homeworkContent;

    private Date createTime;

    private Date updateTime;

}
