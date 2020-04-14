package com.dev.realestate.chun.sign;

import com.dev.realestate.chun.entitys.User;
import com.dev.realestate.chun.enums.UserRole;
import com.dev.realestate.chun.exception.user.UserNotFoundException;
import com.dev.realestate.chun.sign.dto.*;
import com.dev.realestate.chun.util.Converter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignService {
    private final UserRepository userRepository;
    private final Converter converter;

    public SignService(UserRepository userRepository, Converter converter) {
        this.userRepository = userRepository;
        this.converter = converter;
    }

    //TODO("저장하며 오류발생시 AOP로 해결")
    public UserDto signIn(SignInDto dto) throws UserNotFoundException {
        User user = userRepository.findUserByEmail(dto.getEmail())
                .orElseThrow(() -> new UserNotFoundException("해당 사용자는 존재하지 않습니다."));

        return converter.user2UserDto(user);
    }

    public UserDto signUp(SignUpDto dto) {
        User u = userRepository.save(converter.signUpDto2User(dto));
        return converter.user2UserDto(u);
    }

    //TODO("패스워드 인코더 주의")
    public UserDto updateUser(UpdateDto dto) throws UserNotFoundException {
        User user = userRepository.findUserByEmail(dto.getEmail())
                .orElseThrow(() -> new UserNotFoundException("해당 사용자는 존재하지 않습니다."));
        User updateUser = user.updateNickname(dto.getNickname())
                .updatePassword(dto.getPassword());
        userRepository.save(updateUser);
        return converter.user2UserDto(updateUser);
    }

    public void deleteUser(DeleteDto dto) throws UserNotFoundException {
        User user = userRepository.findUserByEmail(dto.getEmail())
                .orElseThrow(() -> new UserNotFoundException("해당 사용자는 존재하지 않습니다."));
        if(user.getPassword().equals(dto.getPassword()))
            userRepository.deleteByEmail(dto.getEmail());
        else
            throw new UserNotFoundException("비밀번호가 다릅니다.");
    }

    public List<UserDto> findAllUser() {
        List<User> all = userRepository.findAll();
        return converter.user2UserDto(all);
    }

    public List<UserDto> findByLivingArea(String livingArea) {
        return null;
    }

    public List<UserDto> findByRole(UserRole valueOf) {
        return null;
    }
}
