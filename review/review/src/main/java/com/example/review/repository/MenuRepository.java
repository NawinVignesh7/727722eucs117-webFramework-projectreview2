package com.example.review.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.review.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer>{
    @Query("select a from Menu a where a.price = :price")
    public List<Menu> findByPrice(@Param("price") double price);
}