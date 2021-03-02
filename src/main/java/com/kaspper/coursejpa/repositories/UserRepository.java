package com.kaspper.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaspper.coursejpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
