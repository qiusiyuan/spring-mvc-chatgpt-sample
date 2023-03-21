package com.siyuan.shoppingbackend.repository;

import com.siyuan.shoppingbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom queries here if needed

    // Example: Find a user by username
    User findByUsername(String username);
}
