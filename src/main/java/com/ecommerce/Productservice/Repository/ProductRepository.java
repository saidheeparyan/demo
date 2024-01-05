package com.ecommerce.Productservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Productservice.Entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,Integer>{
}