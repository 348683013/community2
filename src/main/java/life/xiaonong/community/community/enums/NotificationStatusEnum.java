package life.xiaonong.community.community.enums;

import lombok.Getter;

/**
 * Created by zhouzhongzhong on 2020/2/28
 */
@Getter
public enum  NotificationStatusEnum {
    UNREAD(0),
    READ(1),
    ;
    private int status;

    NotificationStatusEnum(int status) {
        this.status = status;
    }}
