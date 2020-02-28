package life.xiaonong.community.community.enums;

import lombok.Getter;

/**
 * Created by zhouzhongzhong on 2020/2/28
 */
@Getter
public enum NotificationTypeEnum {
    REPLY_QUESTION(1, "回复了话题"),
    REPLY_COMMENT(2, "回复了评论"),
    ;
    private int type;
    private String name;

    NotificationTypeEnum(int status, String name) {
        this.type = status;
        this.name = name;
    }

    public static String nameOfType(int type) {
        for (NotificationTypeEnum notificationTypeEnum : NotificationTypeEnum.values()) {
            if (notificationTypeEnum.getType() == type) {
                return notificationTypeEnum.getName();
            }
        }
        return "";
    }
}
