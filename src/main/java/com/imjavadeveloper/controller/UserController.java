package com.imjavadeveloper.controller;


import com.imjavadeveloper.dto.User;
import com.imjavadeveloper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/users/{UserId}")
    public User getUserId(@PathVariable("UserId") Long userId) {
        return userService.getUserById(userId);
    }

}
