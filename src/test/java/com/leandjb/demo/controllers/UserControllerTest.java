package com.leandjb.demo.controllers;

import com.leandjb.demo.models.User;
import com.leandjb.demo.services.UserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.event.annotation.BeforeTestExecution;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;


@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @Mock
    UserService service;

    @InjectMocks
    UserController controller;

    @BeforeTestExecution
    public void setup(){
        initMocks(this);
    }
    @Test
    public void getUserTest(){

        User user = controller.get(null, "31");
        verify(service).get("31");
    }
}
