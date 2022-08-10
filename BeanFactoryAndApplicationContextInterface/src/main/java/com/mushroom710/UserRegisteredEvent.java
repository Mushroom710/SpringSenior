package com.mushroom710;

// @DATE 2022/8/10
// @TIME 9:52
// @AUTHOR zhangzhi
// @DESCRIPTION

import org.springframework.context.ApplicationEvent;

public class UserRegisteredEvent extends ApplicationEvent {
    public UserRegisteredEvent(Object source) {
        super(source);
    }
}
