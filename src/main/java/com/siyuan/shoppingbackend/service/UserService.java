package com.siyuan.shoppingbackend.service;

import com.siyuan.shoppingbackend.model.User;
import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User findByUsername(String username);

    User save(User user);

    void deleteById(Long id);

    // Add more methods as needed
}
