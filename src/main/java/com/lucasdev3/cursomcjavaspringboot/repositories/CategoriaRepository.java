package com.lucasdev3.cursomcjavaspringboot.repositories;

import com.lucasdev3.cursomcjavaspringboot.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {



}
