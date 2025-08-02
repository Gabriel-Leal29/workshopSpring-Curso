package com.educandoWeb.CursoSpringBoot.repositories;

import com.educandoWeb.CursoSpringBoot.entities.Category;
import com.educandoWeb.CursoSpringBoot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRespository extends JpaRepository<Category, Long> {
}
