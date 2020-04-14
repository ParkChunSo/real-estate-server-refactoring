package com.dev.realestate.chun.util;

import com.dev.realestate.chun.entitys.User;
import com.dev.realestate.chun.sign.dto.SignInDto;
import com.dev.realestate.chun.sign.dto.SignUpDto;
import com.dev.realestate.chun.sign.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Converter {

    public User signInDto2User(SignInDto dto) {
        return null;
    }

    public UserDto user2UserDto(User user) {
        return null;
    }

    public List<UserDto> user2UserDto(List<User> users){
        return null;
    }

    public User signUpDto2User(SignUpDto dto) {
        return null;
    }
}
