package life.xiaonong.community.community.enums;

import lombok.Getter;

/**
 * Created by zhouzhongzhong on 2020/2/24
 */
@Getter
public enum  CommentTypeEnum {
    QUESTION(1),
    COMMENT(2),
    ;
    private Integer type;

    CommentTypeEnum(Integer type) {
        this.type = type;
    }

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if (commentTypeEnum.getType() == type) {
                return true;
            }
        }
        return false;
    }
}
