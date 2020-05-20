package edu.bjtu.sse.djd.demo.core.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name ListResponse
 * @date 2020/5/20 18:12
 **/

@EqualsAndHashCode(callSuper = true)
@Data
public class ListResponse<T> extends AbstractResponse {

    private List<T> data;
}
