package com.ecommerce.Productservice.Entity;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Product_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {


    Integer id;
    String product_name;
    String product_desc;



}