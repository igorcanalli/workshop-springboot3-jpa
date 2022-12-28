package com.igorcanalli.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorcanalli.course.entities.Order;
import com.igorcanalli.course.entities.User;
import com.igorcanalli.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id){
		return repository.findById(id).get();
	}

}
