package cn.code.service_user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("/say")
    public String say() {
        return "say: service_user";
    }

    @ResponseBody
    @RequestMapping("/index")
    public String index() {
        System.out.println("Zuul proxy");
        return "This is service_user";
    }

}
