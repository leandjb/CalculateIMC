package com.leandjb.demo.controllers;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.leandjb.demo.models.User;
import com.leandjb.demo.services.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.event.annotation.BeforeTestExecution;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
    @Test
    public void removeTest(){
        User user = controller.remove(null, "12");
        verify(service).remove("12");
    }
    @Test
    public void getUserObjectTest(){
        User userMock = new User();
        userMock.setEmail("test@test.com");
        userMock.setId("31");
        userMock.setName("nombre");
        userMock.setPassword("clave");

        when(service.get(any())).thenReturn(userMock);

        User user = controller.get(null, "31");
        verify(service).get("31");

        Assertions.assertNotNull(user);
        Assertions.assertEquals("31", user.getId());
    }

    @Test()
    public void getUserTestShouldThrowErrorIfIsNull(){
        when(service.get(null)).thenThrow(new IllegalArgumentException("ID no debe ser nulo"));
        User user = controller.get(null, null);
    }
}
