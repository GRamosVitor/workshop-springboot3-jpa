package com.vitorgramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorgramos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
