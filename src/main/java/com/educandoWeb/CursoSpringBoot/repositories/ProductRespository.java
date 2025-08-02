package com.educandoWeb.CursoSpringBoot.repositories;

import com.educandoWeb.CursoSpringBoot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, Long> {
}
