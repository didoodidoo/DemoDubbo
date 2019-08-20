package cn.code.consumer_demo.controller;

import cn.code.service_user.service.IUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference(version = "1.0.0")
    IUserService service;

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index() {
        System.out.println(service.getUserNum());
        return "DUBBO HELLO";
    }

}
