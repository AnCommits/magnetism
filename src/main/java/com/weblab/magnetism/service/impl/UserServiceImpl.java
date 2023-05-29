package com.weblab.magnetism.service.impl;

import com.weblab.magnetism.model.User;
import com.weblab.magnetism.service.interf.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void create(User entity) {

    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public void delete(User entity) {

    }
}
