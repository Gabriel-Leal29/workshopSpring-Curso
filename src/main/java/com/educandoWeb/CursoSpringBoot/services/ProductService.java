package com.educandoWeb.CursoSpringBoot.services;

import com.educandoWeb.CursoSpringBoot.entities.Product;
import com.educandoWeb.CursoSpringBoot.repositories.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service//camada de serviço, (como componente)
public class ProductService {
    @Autowired //fazendo a injeção de dependencia
    private ProductRespository productRespository;

    public List<Product> findAll(){
        return productRespository.findAll();
        //retorna uma lista de todas as categorias
    }

    public Product findById(Long id){
        Optional<Product> obj = productRespository.findById(id);
        return obj.get();
    }
}
