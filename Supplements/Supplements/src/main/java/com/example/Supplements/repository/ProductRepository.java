package com.example.Supplements.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Supplements.entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}