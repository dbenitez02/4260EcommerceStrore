package edu.cpp.backend.dao;

import edu.cpp.backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
