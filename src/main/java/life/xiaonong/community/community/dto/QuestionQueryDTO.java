package life.xiaonong.community.community.dto;

import lombok.Data;

/**
 * Created by zhouzhongzhong on 2020/3/1
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
