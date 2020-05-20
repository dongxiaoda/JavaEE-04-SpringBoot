package edu.bjtu.sse.djd.demo.core.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 董金达
 * @version 1.0
 * @name DataResponse
 * @date 2020/5/20 13:57
 **/

@EqualsAndHashCode(callSuper = true)
@Data
public class DataResponse<T> extends AbstractResponse {

    private T data;

}
