package com.microservice.user.controller;

import com.microservice.user.VO.ResponseTemplateVO;
import com.microservice.user.entity.User;
import com.microservice.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){

        log.info("inside saveUser method of UserController.");
        return userService.saveUser(user);
    }

    @GetMapping("/all")
    public List<User> getUsers(){

        log.info("inside getUsers method of UserController.");
        return userService.getUsers();
    }

    /*@GetMapping("/{Id}")
    public Optional<User> getUserById(@PathVariable("Id") Long Id){

        log.info("inside getUserById method of UserController.");
        return userService.getUserById(Id);
    }
*/
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }

}
