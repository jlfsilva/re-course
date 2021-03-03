package com.kaspper.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaspper.coursejpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
