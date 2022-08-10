package com.mushroom710;

// @DATE 2022/8/10
// @TIME 10:07
// @AUTHOR zhangzhi
// @DESCRIPTION


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 切面类
 * @author zhangzhi
 */

@Component
@Aspect
@Slf4j
public class MyAdvice {

    @Autowired
    private Component1 component1;

    // 定义切点
    @Pointcut("execution(void com.mushroom710.Component1.register())")
    private void pt(){}

    @After("pt()")
    public void method(){
        log.info("aop--用户注册--发送短信:{}",component1);
    }
}
