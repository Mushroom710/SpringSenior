package com.mushroom710;

// @DATE 2022/8/10
// @TIME 9:50
// @AUTHOR zhangzhi
// @DESCRIPTION

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Component2 {

    @EventListener
    public void listener(UserRegisteredEvent event){
        log.info("component2 listener:{}",event);
        log.info("发送短信");
    }
}
