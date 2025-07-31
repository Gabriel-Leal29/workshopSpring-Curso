package com.educandoWeb.CursoSpringBoot.services;

import com.educandoWeb.CursoSpringBoot.entities.User;
import com.educandoWeb.CursoSpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service//camada de serviço, (como componente)
public class UserService {
    @Autowired //fazendo a injeção de dependencia
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
        //retorna uma lista de todos os usuários
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
