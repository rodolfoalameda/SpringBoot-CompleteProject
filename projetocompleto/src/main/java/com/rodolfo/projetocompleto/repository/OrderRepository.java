package com.rodolfo.projetocompleto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodolfo.projetocompleto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
