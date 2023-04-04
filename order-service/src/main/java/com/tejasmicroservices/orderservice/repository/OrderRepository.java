package com.tejasmicroservices.orderservice.repository;

import com.tejasmicroservices.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
