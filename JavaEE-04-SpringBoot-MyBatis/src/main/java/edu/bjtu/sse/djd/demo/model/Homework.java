package edu.bjtu.sse.djd.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 董金达
 * @version 1.0
 * @name Homework
 * @date 2020/5/22 16:58
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Homework {

    private Long id;

    private String title;

    private String content;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

}
