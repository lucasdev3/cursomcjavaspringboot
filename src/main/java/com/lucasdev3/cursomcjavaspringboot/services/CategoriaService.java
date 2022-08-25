package com.lucasdev3.cursomcjavaspringboot.services;

import com.lucasdev3.cursomcjavaspringboot.domain.Categoria;
import com.lucasdev3.cursomcjavaspringboot.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private final CategoriaRepository repo;

    public CategoriaService(CategoriaRepository repo) {
        this.repo = repo;
    }

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }

}
