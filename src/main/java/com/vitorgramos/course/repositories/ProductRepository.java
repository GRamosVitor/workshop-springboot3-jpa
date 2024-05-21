package com.vitorgramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorgramos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
