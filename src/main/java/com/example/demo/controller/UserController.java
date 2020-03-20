package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author xiech
 * @create 2019-09-03 14:02
 */
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;


    @RequestMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userDao.save(user);
    }


    @RequestMapping("/findById")
    public Optional<User> findById(String id){
        return userDao.findById(id);
    }
}
