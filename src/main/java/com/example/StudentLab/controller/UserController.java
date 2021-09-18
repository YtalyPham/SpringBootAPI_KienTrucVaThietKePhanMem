package com.example.StudentLab.controller;

import com.example.StudentLab.dto.UserDTO;
import com.example.StudentLab.entity.User;
import com.example.StudentLab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/users")
    public UserDTO saveUser(@RequestBody User user){
        return new UserDTO(userService.saveUser(user));
    }

    @GetMapping("/users")
    public List<UserDTO> getListUsers(){
        List<User> list= userService.getAllUsers();
        List<UserDTO> list1= new ArrayList<>();
        for (User user:list) {
            list1.add(new UserDTO(user));
        }
        return list1;
    }


}
