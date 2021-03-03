package com.kaspper.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaspper.coursejpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
