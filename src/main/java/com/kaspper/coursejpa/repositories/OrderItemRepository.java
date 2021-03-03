package com.kaspper.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaspper.coursejpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
