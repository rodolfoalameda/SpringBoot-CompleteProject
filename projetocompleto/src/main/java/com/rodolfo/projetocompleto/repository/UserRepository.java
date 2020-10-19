package com.rodolfo.projetocompleto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodolfo.projetocompleto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
