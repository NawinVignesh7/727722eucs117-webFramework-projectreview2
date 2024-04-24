package com.example.review.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResOrder {
    @Id
    private int id;
    private int userid;
    private LocalDateTime createdAt = LocalDateTime.now();
    
    @OneToMany(mappedBy = "resOrder")
    @JsonManagedReference
    private List<Menu> menus;
}
