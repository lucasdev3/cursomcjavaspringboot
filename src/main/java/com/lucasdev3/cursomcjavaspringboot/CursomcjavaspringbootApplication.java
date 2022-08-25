package com.lucasdev3.cursomcjavaspringboot;

import com.lucasdev3.cursomcjavaspringboot.domain.Categoria;
import com.lucasdev3.cursomcjavaspringboot.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CursomcjavaspringbootApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcjavaspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		Categoria cat1 = new Categoria("Informática");
		Categoria cat2 = new Categoria("Escritório");

		List<Categoria> listCategorias = new ArrayList<>();
		listCategorias.add(cat1);
		listCategorias.add(cat2);

		categoriaRepository.saveAll(listCategorias);

	}

}
