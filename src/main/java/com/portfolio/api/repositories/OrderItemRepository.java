package com.portfolio.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.api.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
