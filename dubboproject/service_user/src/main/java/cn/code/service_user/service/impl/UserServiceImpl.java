package cn.code.service_user.service.impl;

import cn.code.service_user.pojo.User;
import cn.code.service_user.service.IUserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component

@Service(version = "1.0.0",timeout = 10000,interfaceClass = IUserService.class)
public class UserServiceImpl implements IUserService {


    @Override
    public int addUser(User user) {

        if(null==user)
            return 0;
        return 1;
    }
}
