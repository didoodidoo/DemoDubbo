package cn.code.service_user.service.impl;

import cn.code.service_user.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public String say() {
        return "say";
    }
}
