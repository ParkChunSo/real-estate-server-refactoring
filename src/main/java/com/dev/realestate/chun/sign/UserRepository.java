package com.dev.realestate.chun.sign;

import com.dev.realestate.chun.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByEmail(String email);
    void deleteByEmail(String email);
}
