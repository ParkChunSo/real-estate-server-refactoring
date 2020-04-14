package com.dev.realestate.chun.exception.user;

import com.dev.realestate.chun.exception.user.UserException;

public class UserAlreadyExistException extends UserException {
    public UserAlreadyExistException(String message) {
        super(message);
    }
}
