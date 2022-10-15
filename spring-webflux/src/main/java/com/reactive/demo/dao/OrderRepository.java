package com.reactive.demo.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.reactive.demo.model.Order;

import reactor.core.publisher.Flux;
 
public interface OrderRepository extends ReactiveMongoRepository<Order, Integer> {
    @Query("{ 'name': ?0 }")
    Flux<Order> findByName(final String name);
}