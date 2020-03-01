package life.xiaonong.community.community.exception;

/**
 * Created by zhouzhongzhong on 2020/2/22
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND(2001, "此问题不存在或者已删除！"),
    TARGET_PARAM_NOT_FOUND(2002, "未选中任何问题或评论进行恢复"),
    NO_LOGIN(2003, "当前操作需要登陆，请登陆后重试"),
    SYS_ERROR(2004, "服务器爆满，请稍后再试！"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006, "回复的评论不存在了，换一个试试"),
    CONTENT_IS_EMPTY(2007, "输入内容不能为空"),
    READ_NOTIFICATION_FAIL(2008, "只能读取自己的消息"),
    NOTIFICATION_NOT_FOUND(2009, "消息未找到"),
    FILE_UPLOAD_FAIL(2010, "图片上传失败"),

    ;
    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
