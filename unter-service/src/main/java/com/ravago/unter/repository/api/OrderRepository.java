package com.ravago.unter.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravago.unter.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	Order findByOrderNo(String orderNo);
}
