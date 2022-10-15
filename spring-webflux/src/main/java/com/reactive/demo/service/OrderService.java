package com.reactive.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactive.demo.dao.OrderRepository;
import com.reactive.demo.model.Order;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
@Service
public class OrderService implements IOrderService {
     
    @Autowired
    OrderRepository orderRepo;
 
    public void create(Order e) {
        orderRepo.save(e).subscribe();
    }
 
    public Mono<Order> findById(Integer id) {
        return orderRepo.findById(id);
    }
 
    public Flux<Order> findByName(String name) {
        return orderRepo.findByName(name);
    }
 
    public Flux<Order> findAll() {
        return orderRepo.findAll();
    }
 
    public Mono<Order> update(Order e) {
        return orderRepo.save(e);
    }
 
    public Mono<Void> delete(Integer id) {
        return orderRepo.deleteById(id);
    }
 
}