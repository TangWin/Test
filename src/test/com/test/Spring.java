package com.test;

import com.dao.UserDao;
import com.entity.User;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {

    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        User user=userDao.getUserById(1);
        System.out.println(user);
    }
}
