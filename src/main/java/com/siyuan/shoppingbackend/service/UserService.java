package com.siyuan.shoppingbackend.service;

import com.siyuan.shoppingbackend.model.User;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    Page<User> findAll(Pageable pageable);

    User findById(Long id);

    User findByUsername(String username);

    User save(User user);

    void deleteById(Long id);

    // Add more methods as needed
}
