package com.example.StudentLab.dto;

import com.example.StudentLab.entity.User;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UserDTO {

    private String fullName;

    private String email;

    private String avatar;

    private String phone;

    public UserDTO(User origin) {
        this.fullName = origin.getFullName();
        this.email = origin.getEmail();
        this.avatar = origin.getAvatar();
        this.phone=origin.getPhone();
    }
}
