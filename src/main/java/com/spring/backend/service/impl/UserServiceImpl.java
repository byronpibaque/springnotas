package com.spring.backend.service.impl;

import com.spring.backend.entity.User;
import com.spring.backend.repository.UserRepository;
import com.spring.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> List() {
        return null;
    }

    @Override
    public User findbyId(Long id) {
        return null;
    }

    @Override
    public User add(User req) {
        return null;
    }

    @Override
    public User put(User req) {
        return null;
    }

    @Override
    public void deletebyId(User req) {

    }
}
