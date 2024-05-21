package com.vitorgramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorgramos.course.entities.OrderItem;
import com.vitorgramos.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
