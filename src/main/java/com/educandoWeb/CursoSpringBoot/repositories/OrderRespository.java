package com.educandoWeb.CursoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoWeb.CursoSpringBoot.entities.Order;

public interface OrderRespository extends JpaRepository<Order, Long> {
}
