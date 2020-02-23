package life.xiaonong.community.community.exception;

/**
 * Created by zhouzhongzhong on 2020/2/22
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND("此问题不存在或者已删除！"),
    ;
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
