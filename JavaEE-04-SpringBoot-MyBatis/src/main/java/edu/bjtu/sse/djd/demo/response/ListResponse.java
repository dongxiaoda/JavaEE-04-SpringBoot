package edu.bjtu.sse.djd.demo.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author 董金达
 * @version 1.0
 * @name HomeworkResponse
 * @date 2020/5/22 20:37
 **/

@EqualsAndHashCode(callSuper = true)
@Data
public class ListResponse<T> extends AbstractResponse {

    private List<T> data;

}
