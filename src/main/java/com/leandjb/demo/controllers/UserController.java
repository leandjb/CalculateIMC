package com.leandjb.demo.controllers;

import com.leandjb.demo.models.User;
import com.leandjb.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpHeaders;

@RestController
@RequestMapping("api/user")
public class UserController {

    private UserService service;

    @Autowired
    public void UserController(UserService service){
        this.service = service;
    }

    @RequestMapping("/{id}")
    User get(@RequestHeader HttpHeaders headers, @PathVariable String id) {
        return service.get(id);
    }

    User remove(@RequestHeader HttpHeaders headers, @PathVariable String id){
        service.remove(id);
        return null;
    }
}
