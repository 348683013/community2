package life.xiaonong.community.community.dto;

import life.xiaonong.community.community.model.User;
import lombok.Data;

/**
 * Created by zhouzhongzhong on 2020/2/25
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
