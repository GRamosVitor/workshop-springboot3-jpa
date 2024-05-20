package com.vitorgramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorgramos.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
