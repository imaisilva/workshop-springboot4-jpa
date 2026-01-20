package com.portfolio.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.api.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
