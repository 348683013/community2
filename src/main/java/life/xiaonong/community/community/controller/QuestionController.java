package life.xiaonong.community.community.controller;

import life.xiaonong.community.community.dto.CommentDTO;
import life.xiaonong.community.community.dto.QuestionDTO;
import life.xiaonong.community.community.mapper.QuestionMapper;
import life.xiaonong.community.community.service.CommentService;
import life.xiaonong.community.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by zhouzhongzhong on 2020/2/21
 */
@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Long id,
                           Model model) {
        QuestionDTO questionDTO = questionService.getById(id);

        List<CommentDTO> comments = commentService.ListByQuestionId(id);

        //累加阅读数
        questionService.incView(id);
        model.addAttribute("question", questionDTO);
        return "question";
    }
}
