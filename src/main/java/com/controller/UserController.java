package com.controller;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;


    @RequestMapping("say")
    public String say(){
        return "success";
    }

    @RequestMapping("login")
    public String login(User user, HttpServletRequest request){
        System.out.println(user);
        request.setAttribute("user",user);
        return  "success";
    }

    @ResponseBody
    @RequestMapping("getuser")
    public List<User> getuser(){
        List<User> userList=new ArrayList<User>();
        for (int i = 0; i < 5; i++) {
            userList.add(new User("小大"+i, i+""));
        }
        return userList;
    }

    @RequestMapping("adduser")
    public String adduser(User user){
        userDao.adduser(user);
        return  "success";
    }
}
