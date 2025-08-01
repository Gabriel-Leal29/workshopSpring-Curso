package com.educandoWeb.CursoSpringBoot.services;

import com.educandoWeb.CursoSpringBoot.entities.Order;
import com.educandoWeb.CursoSpringBoot.repositories.OrderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRespository orderRespository;

    public List<Order> findAll() {
        return orderRespository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRespository.findById(id);
        return obj.get();
    }
}
