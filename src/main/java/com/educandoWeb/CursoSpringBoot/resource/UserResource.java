package com.educandoWeb.CursoSpringBoot.resource;

import com.educandoWeb.CursoSpringBoot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping//identificar q é uma requisição GET
    public ResponseEntity<User> findAll() {
        User u = new User(1L,"Jorge","maria@gmail.com","passowrd", "999999999");
        return ResponseEntity.ok().body(u);
    };
}
