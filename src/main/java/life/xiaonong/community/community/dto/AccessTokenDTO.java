package life.xiaonong.community.community.dto;

import lombok.Data;

/**
 * Created by zhouzhongzhong on 2020/2/15
 * 参数超过两个，习惯封装成对象来进行操作
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
