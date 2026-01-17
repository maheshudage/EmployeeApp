package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tka.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	
}