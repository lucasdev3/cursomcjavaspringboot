package com.lucasdev3.cursomcjavaspringboot.resources;

import com.lucasdev3.cursomcjavaspringboot.domain.Categoria;
import com.lucasdev3.cursomcjavaspringboot.services.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    private final CategoriaService service;

    public CategoriaResource(CategoriaService service) {
        this.service = service;
    }

    @RequestMapping(value = "/{id}",  method = RequestMethod.GET)
    public ResponseEntity<Categoria> find(@PathVariable Integer id) {

        Categoria obj = service.find(id);

        if (Objects.isNull(obj)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok().body(obj);
    }

}
