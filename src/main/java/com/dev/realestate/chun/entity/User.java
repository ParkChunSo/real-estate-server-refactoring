package com.dev.realestate.chun.entity;

import com.dev.realestate.chun.sign.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Table(name = "user_tbl")
@Entity @Builder @Getter
@AllArgsConstructor @NoArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    private String nickname;

    private Set<UserRole> roles;

    //TODO("Security 넣으면서 PasswordEncoding 고려")
    public User changePassword(String password){
        return this;
    }

    public User changeNickname(String nickname){
        this.nickname = nickname;
        return this;
    }
}
