package com.reactive.demo.service;

import com.reactive.demo.model.Order;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
public interface IOrderService
{
    void create(Order e);
     
    Mono<Order> findById(Integer id);
 
    Flux<Order> findByName(String name);
 
    Flux<Order> findAll();
 
    Mono<Order> update(Order e);
 
    Mono<Void> delete(Integer id);
}