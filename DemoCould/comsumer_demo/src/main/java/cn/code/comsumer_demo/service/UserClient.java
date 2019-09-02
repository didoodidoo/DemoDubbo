package cn.code.comsumer_demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "SERVICE-USER")
public interface UserClient {

    @GetMapping("/say")
    public String say();

}
