package com.kaspper.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaspper.coursejpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
