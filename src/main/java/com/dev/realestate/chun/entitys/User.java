package com.dev.realestate.chun.entitys;

import com.dev.realestate.chun.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

/**
 * 사용자 정보를 저장하는 테이블
 * id: primary key
 * email: 사용자 id
 * password: 비밀번호
 * name: 사용자 이름
 * nickname: 어플리케이션 커뮤니티 기능에서 사용할 별명(중복 허용)
 * roles: 사용자 권한
 */
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

    private String phone;

    @Enumerated(EnumType.STRING)
    private Set<UserRole> roles;

    //TODO("Security 넣으면서 PasswordEncoding 고려")
    public User updatePassword(String password){
        return this;
    }

    public User updateNickname(String nickname){
        this.nickname = nickname;
        return this;
    }
}
