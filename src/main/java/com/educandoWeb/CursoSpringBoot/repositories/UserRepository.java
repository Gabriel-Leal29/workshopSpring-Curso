package com.educandoWeb.CursoSpringBoot.repositories;

import com.educandoWeb.CursoSpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
