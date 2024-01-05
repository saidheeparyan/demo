package com.ecommerce.Productservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Productservice.Entity.Product;
import com.ecommerce.Productservice.Service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public String save(@RequestBody Product product){

        productService.save(product);
        return "One Product details added";
    }

    @PostMapping("/postall")
    @ResponseStatus(HttpStatus.CREATED)
    public String save(@RequestBody List<Product> product){

        productService.saveAll(product);
        return product.size()+" Products details added ";
    }
    

    @GetMapping("/getall")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Product> getMethodName() {

        return productService.getAll();

    }
    
    @GetMapping("/get")
    public Product getProduct(@RequestParam("id") Integer id) {
       return  productService.getById(id);
    }

}