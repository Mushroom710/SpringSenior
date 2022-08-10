package com.mushroom710;

// @DATE 2022/8/10
// @TIME 10:00
// @AUTHOR zhangzhi
// @DESCRIPTION

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Component3 {

    @EventListener
    public void listener(UserRegisteredEvent event) {
        log.info("component 2 listener:{}",event);
        log.info("发送邮件");
    }
}
