package com.spring.backend.service;

import com.spring.backend.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> List();
    public User findbyId(Long id);
    public User add(User req);
    public User put(User req);
    public void deletebyId(User req);
}
