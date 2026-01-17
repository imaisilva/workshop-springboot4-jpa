package com.portfolio.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
