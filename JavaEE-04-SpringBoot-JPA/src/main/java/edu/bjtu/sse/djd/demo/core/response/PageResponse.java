package edu.bjtu.sse.djd.demo.core.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 董金达
 * @version 1.0
 * @name PageResponse
 * @date 2020/5/20 18:10
 **/

@EqualsAndHashCode(callSuper = true)
@Data
public class PageResponse<T> extends ListResponse<T> {

    private long total;

}
