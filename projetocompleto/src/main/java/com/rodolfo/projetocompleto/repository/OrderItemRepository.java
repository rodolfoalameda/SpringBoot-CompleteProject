package com.rodolfo.projetocompleto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodolfo.projetocompleto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
