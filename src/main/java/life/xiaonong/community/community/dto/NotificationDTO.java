package life.xiaonong.community.community.dto;

import life.xiaonong.community.community.model.User;
import lombok.Data;

/**
 * Created by zhouzhongzhong on 2020/2/28
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
