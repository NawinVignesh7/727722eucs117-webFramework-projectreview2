package com.example.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.review.model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Integer>{
    
}
