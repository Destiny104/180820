package com.newer.test;

import com.newer.bean.User;
import com.newer.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test1() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service=ctx.getBean("userService", UserService.class);
        service.findAll().forEach(user -> System.out.println(user.getUserName()));
    }

    @Test
    public void testAdd() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service=ctx.getBean("userService", UserService.class);
        User user=new User();
        user.setUserName("LINA");
        user.setUserPwd("111111");
        service.addUser(user);
    }
}
