package com.example.StudentLab.service;

import com.example.StudentLab.dto.UserDTO;
import com.example.StudentLab.entity.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
