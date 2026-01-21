package com.portfolio.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.api.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
