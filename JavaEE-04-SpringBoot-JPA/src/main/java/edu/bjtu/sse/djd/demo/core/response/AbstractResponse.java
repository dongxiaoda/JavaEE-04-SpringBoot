package edu.bjtu.sse.djd.demo.core.response;

import lombok.Data;

/**
 * @author 董金达
 * @version 1.0
 * @name BaseResponse
 * @date 2020/5/20 18:13
 **/

@Data
public abstract class AbstractResponse {

    private int code;

    private String msg;

}
