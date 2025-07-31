package com.educandoWeb.CursoSpringBoot.config;

import com.educandoWeb.CursoSpringBoot.entities.User;
import com.educandoWeb.CursoSpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    //CommandLineRunner -> é pra rodar ao iniciar o projeto

    @Autowired
    private UserRepository userRepository;

    //tudo dentro desse método vai ser executado quando iniciar a aplicação
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));//saveAll -> adiciona uma lista de objetos
    }
}
