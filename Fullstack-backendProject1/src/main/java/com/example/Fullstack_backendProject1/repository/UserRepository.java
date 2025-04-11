package com.example.Fullstack_backendProject1.repository;

import com.example.Fullstack_backendProject1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
