package com.igorcanalli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorcanalli.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
