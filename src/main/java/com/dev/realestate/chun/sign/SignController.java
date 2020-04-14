package com.dev.realestate.chun.sign;

import com.dev.realestate.chun.enums.UserRole;
import com.dev.realestate.chun.sign.dto.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/user")
public class SignController {
    private final SignService signService;

    public SignController(SignService signService) {
        this.signService = signService;
    }

    @PostMapping("/signIn")
    public UserDto signIn(SignInDto dto){
        return signService.signIn(dto);
    }

    @PostMapping("/signUp")
    public UserDto signUp(SignUpDto dto){
        return signService.signUp(dto);
    }

    @PutMapping("/update")
    public UserDto updateInfo(UpdateDto dto){
        return signService.updateUser(dto);
    }

    @DeleteMapping("/delete")
    public void deleteUser(DeleteDto dto){
        signService.deleteUser(dto);
    }

    @GetMapping("/all")
    public List<UserDto> findAllUser(){
        return signService.findAllUser();
    }

    @GetMapping("/{livingArea}")
    public List<UserDto> findByLivingArea(@PathVariable String livingArea){
        return signService.findByLivingArea(livingArea);
    }

    @GetMapping("/{role}")
    public List<UserDto> findByRole(@PathVariable String role){
        return signService.findByRole(UserRole.valueOf(role));
    }
}
