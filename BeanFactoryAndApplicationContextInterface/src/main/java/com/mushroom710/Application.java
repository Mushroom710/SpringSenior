package com.mushroom710;

// @DATE 2022/8/10
// @TIME 9:45
// @AUTHOR zhangzhi
// @DESCRIPTION
// 4. 学到了什么
//   a. BeanFactory 与 ApplicationContext 并不仅仅是简单接口继承的关系, ApplicationContext 组合并扩展了 BeanFactory 的功能
//   b. 又新学一种代码之间解耦途径
//   练习：完成用户注册与发送短信之间的解耦, 用事件方式、和 AOP 方式分别实现


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhangzhi
 */
@SpringBootApplication
@Slf4j
@EnableAspectJAutoProxy
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        log.info("Application started successfully");

//        context.publishEvent(new UserRegisteredEvent(context));
        context.getBean(Component1.class).register();

//        ConfigurableApplicationContext context = SpringApplication.run(A01.class, args);
//        /*
//            1. 到底什么是 BeanFactory
//                - 它是 ApplicationContext 的父接口
//                - 它才是 Spring 的核心容器, 主要的 ApplicationContext 实现都【组合】了它的功能
//         */
//        System.out.println(context);
//
//
//        /*
//            2. BeanFactory 能干点啥
//                - 表面上只有 getBean
//                - 实际上控制反转、基本的依赖注入、直至 Bean 的生命周期的各种功能, 都由它的实现类提供
//         */
//        Field singletonObjects = DefaultSingletonBeanRegistry.class.getDeclaredField("singletonObjects");
//        singletonObjects.setAccessible(true);
//        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
//        Map<String, Object> map = (Map<String, Object>) singletonObjects.get(beanFactory);
//        map.entrySet().stream().filter(e -> e.getKey().startsWith("component"))
//                .forEach(e -> {
//                    System.out.println(e.getKey() + "=" + e.getValue());
//                });
//
//        /*
//            3. ApplicationContext 比 BeanFactory 多点啥
//         */
//        System.out.println(context.getMessage("hi", null, Locale.CHINA));
//        System.out.println(context.getMessage("hi", null, Locale.ENGLISH));
//        System.out.println(context.getMessage("hi", null, Locale.JAPANESE));
//
//        Resource[] resources = context.getResources("classpath*:META-INF/spring.factories");
//        for (Resource resource : resources) {
//            System.out.println(resource);
//        }
//
//        System.out.println(context.getEnvironment().getProperty("java_home"));
//        System.out.println(context.getEnvironment().getProperty("server.port"));
    }
}
