package edu.bjtu.sse.djd.demo.core.request;

import lombok.Data;

/**
 * @author 董金达
 * @version 1.0
 * @name PageRequest
 * @date 2020/5/20 18:25
 **/

@Data
public abstract class AbstractPageRequest {

    private  int page = 0;

    private int size = 2;

}
