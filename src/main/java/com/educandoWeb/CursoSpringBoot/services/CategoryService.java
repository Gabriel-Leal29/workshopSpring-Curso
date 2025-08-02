package com.educandoWeb.CursoSpringBoot.services;

import com.educandoWeb.CursoSpringBoot.entities.Category;
import com.educandoWeb.CursoSpringBoot.repositories.CategoryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service//camada de serviço, (como componente)
public class CategoryService {
    @Autowired //fazendo a injeção de dependencia
    private CategoryRespository categoryRespository;

    public List<Category> findAll(){
        return categoryRespository.findAll();
        //retorna uma lista de todas as categorias
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRespository.findById(id);
        return obj.get();
    }
}
