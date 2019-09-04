package cn.code.consumer_demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "SERVER-ZUUL")
public interface UserClient {
    @GetMapping("/user/say")
    public String say();

}
