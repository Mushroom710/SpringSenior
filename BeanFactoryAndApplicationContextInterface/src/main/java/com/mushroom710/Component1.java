package com.mushroom710;

// @DATE 2022/8/10
// @TIME 9:50
// @AUTHOR zhangzhi
// @DESCRIPTION

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Component1 {

    @Autowired
    private ApplicationEventPublisher context;

    public void register(){
        log.info("用户注册");
        // 发送事件对象
        context.publishEvent(new UserRegisteredEvent(this));
    }
}
