package life.xiaonong.community.community.mapper;

import life.xiaonong.community.community.model.Comment;
import life.xiaonong.community.community.model.CommentExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}