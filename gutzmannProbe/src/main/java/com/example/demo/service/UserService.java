package com.example.demo.service;

import com.example.demo.persistance.entity.User;
import com.example.demo.persistance.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    final UserRepository userRepository;

    public UUID createUser(User userRequestToUser) {
        User user = new User();

        userRepository.save(user);

        return user.getId();
    }
}
