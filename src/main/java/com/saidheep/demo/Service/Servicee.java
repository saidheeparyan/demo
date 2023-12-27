package com.saidheep.demo.Service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@ConfigurationProperties(prefix= "hello")
@Data
public class Servicee {
    
    String name;
} 
