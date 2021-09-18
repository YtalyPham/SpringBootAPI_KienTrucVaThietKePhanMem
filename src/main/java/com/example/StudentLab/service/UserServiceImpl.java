package com.example.StudentLab.service;

import com.example.StudentLab.dto.UserDTO;
import com.example.StudentLab.entity.User;
import com.example.StudentLab.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> list= new ArrayList<User>();
        userRepository.findAll().forEach(user -> list.add(user));
        return list;
    }
}
