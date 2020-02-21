package life.xiaonong.community.community.model;

import lombok.Data;

/**
 * Created by zhouzhongzhong on 2020/2/16
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
