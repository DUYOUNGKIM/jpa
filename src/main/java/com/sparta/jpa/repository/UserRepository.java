package com.sparta.jpa.repository;

import com.sparta.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, String> {
}