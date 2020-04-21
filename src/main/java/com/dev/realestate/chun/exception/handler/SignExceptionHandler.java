package com.dev.realestate.chun.exception.handler;

import com.dev.realestate.chun.exception.user.UserAlreadyExistException;
import com.dev.realestate.chun.exception.user.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class SignExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity handleUserNotFoundException(HttpServletRequest request, UserNotFoundException e){
        return null;
    }
    @ExceptionHandler(UserAlreadyExistException.class)
    public ResponseEntity handleUseAlreadyExistException(HttpServletRequest request, UserAlreadyExistException e){
        return null;
    }
}
