package dev.jlucasbs.study.spring_ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.jlucasbs.study.spring_ws.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
