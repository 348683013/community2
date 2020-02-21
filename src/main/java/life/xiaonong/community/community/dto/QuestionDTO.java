package life.xiaonong.community.community.dto;

import life.xiaonong.community.community.model.User;
import lombok.Data;

/**
 * Created by zhouzhongzhong on 2020/2/18
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
