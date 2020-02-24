package life.xiaonong.community.community.dto;

import lombok.Data;

/**
 * Created by zhouzhongzhong on 2020/2/24
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
