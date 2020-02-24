package life.xiaonong.community.community.controller;

import life.xiaonong.community.community.dto.CommentDTO;
import life.xiaonong.community.community.dto.ResultDTO;
import life.xiaonong.community.community.exception.CustomizeErrorCode;
import life.xiaonong.community.community.mapper.CommentMapper;
import life.xiaonong.community.community.model.Comment;
import life.xiaonong.community.community.model.User;
import life.xiaonong.community.community.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhouzhongzhong on 2020/2/24
 */
@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    //@ResponseBody把对象序列化成json格式
    @ResponseBody
    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public Object post(@RequestBody CommentDTO commentDTO,
                       HttpServletRequest request) {
        //@RequestBody把json反序列化成对象

        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResultDTO.errorOf(CustomizeErrorCode.NO_LOGIN);
        }

        Comment comment = new Comment();
        comment.setParentId(commentDTO.getParentId());
        comment.setContent(commentDTO.getContent());
        comment.setType(commentDTO.getType());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setCommentator(user.getId());
        comment.setLikeCount(0L);
        commentService.insert(comment);
        return ResultDTO.okOf();
    }
}
