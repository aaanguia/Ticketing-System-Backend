package com.example.demo.controller;

import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.User;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("addUser")
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("users")
    public List<User> getUsers(){
        return this.userService.getUsers();
    }

    @GetMapping("users/{id}")
    public User getUserById(@PathVariable int id){
        return this.userService.getUserById(id);
    }

    @DeleteMapping("users/delete/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }
    @PostMapping("updateUser")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

}
