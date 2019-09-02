package cn.code.comsumer_demo.controller;

import cn.code.comsumer_demo.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class IndexController {


    @Resource
    private UserClient client;

    @ResponseBody
    @RequestMapping("/index")
    public String index() {
        return client.say();
    }

}
