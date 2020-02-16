package life.xiaonong.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zhouzhongzhong on 2020/2/15
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String Hello() {
        return "index";
    }
}
