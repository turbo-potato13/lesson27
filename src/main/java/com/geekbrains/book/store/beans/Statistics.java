package com.geekbrains.book.store.beans;

import lombok.Data;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Map;

@Aspect
@Component
@Data
public class Statistics {
    private int countBookService;
    private int countOrderService;
    private int countUserService;

    @AfterReturning("execution(public * com.geekbrains.book.store.services.BookService.*(..))")
    public void afterMethodBookService() {
        countBookService++;
    }

    @AfterReturning("execution(public * com.geekbrains.book.store.services.OrderService.*(..))")
    public void afterMethodOrderService() {
        countOrderService++;
    }

    @AfterReturning("execution(public * com.geekbrains.book.store.services.UserService.*(..))")
    public void afterMethod() {
        countUserService++;
    }


}
