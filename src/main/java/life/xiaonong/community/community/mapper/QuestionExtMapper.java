package life.xiaonong.community.community.mapper;

import life.xiaonong.community.community.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);

    int incCommentCount(Question record);
}