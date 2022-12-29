package com.igorcanalli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorcanalli.course.entities.OrderItem;
import com.igorcanalli.course.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
