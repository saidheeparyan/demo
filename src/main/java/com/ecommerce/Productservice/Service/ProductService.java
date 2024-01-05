package com.ecommerce.Productservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Productservice.Entity.Product;
import com.ecommerce.Productservice.Repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void save(Product product) {
        productRepository.save(product);
    }

    public void saveAll(List<Product> product) {
        productRepository.saveAll(product);
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getById(Integer param) {
        return productRepository.findById(param).get();
    }
    
}