package com.dev.realestate.chun.aop;

import com.dev.realestate.chun.exception.user.UserAlreadyExistException;
import com.dev.realestate.chun.exception.user.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class SignAop {
    @Around("execution(* com.dev.realestate.chun.sign.SignService.*(..))")
    public Object handleUserException(ProceedingJoinPoint joinPoint){
        Object result = null;
        try{
            result = joinPoint.proceed();
        }catch (UserNotFoundException e){
            log.error(e.getMessage());
        }catch (UserAlreadyExistException e){
            log.error("");
            log.error(e.getMessage());
        }catch (Throwable e){
            log.error(e.getMessage());
        }
        return result;
    }
}

