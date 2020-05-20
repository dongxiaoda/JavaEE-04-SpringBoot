package edu.bjtu.sse.djd.demo.core.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 董金达
 * @version 1.0
 * @name HomeworkPageRequest
 * @date 2020/5/20 18:24
 **/

@EqualsAndHashCode(callSuper = true)
@Data
public class HomeworkPageRequest extends AbstractPageRequest{

    private Long id;

}
