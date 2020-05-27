package edu.bjtu.sse.djd.demo.response;

import lombok.Data;

/**
 * @author 董金达
 * @version 1.0
 * @name AbstractResponse
 * @date 2020/5/22 20:36
 **/

@Data
public abstract class AbstractResponse {

    private int code;

    private String msg;
}
