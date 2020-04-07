package com.dev.realestate.chun.sign;

import com.dev.realestate.chun.sign.dto.SignInDto;
import com.dev.realestate.chun.sign.dto.SignUpDto;
import com.dev.realestate.chun.sign.dto.UserDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SignController {

    @PostMapping("/signin")
    public void signIn(SignInDto dto){

    }

    @PostMapping("/signUp")
    public void signUp(SignUpDto dto){

    }

    @PutMapping("/update")
    public void updateInfo(SignUpDto dto){

    }

    @DeleteMapping("/delete")
    public void deleteUser(SignInDto dto){

    }

    public List<UserDto> findAll(){
        return null;
    }

    public List<UserDto> findUserByLivingArea(String LivingArea){
        return null;
    }

    public List<UserDto> findUserByRole(String role){
        return null;
    }
}
