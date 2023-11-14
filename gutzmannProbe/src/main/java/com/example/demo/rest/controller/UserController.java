package com.example.demo.rest.controller;

import com.example.demo.mapper.MapstructMapper;
import com.example.demo.model.request.CreateUserRequest;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    final MapstructMapper mapper;
    final UserService userService;

    @PostMapping("create")
    UUID createUser(@RequestBody CreateUserRequest createUserRequest) {
        return userService.createUser(mapper.createUserRequestToUser(createUserRequest));
    }
}
