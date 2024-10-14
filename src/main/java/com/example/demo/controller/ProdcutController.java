package com.example.demo.controller;

import com.example.demo.Services.ProductServices;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProdcutController {
    @Autowired
    ProductServices services;
@GetMapping("/products")
    public List<Product> getProducts(){
        return services.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getById(@PathVariable int prodId){
        return services.getProductById(prodId);
    }
    @PostMapping("/add")
    public void addProduct(@RequestBody Product product){
      services.addProduct(product);
    }
    @PutMapping("/update")
    public void update(@RequestBody Product product){
    services.updateProduct(product);
    }
    @DeleteMapping("/delete/{prodId}")
    public void delete(@PathVariable int prodId){
    services.deleteProduct(prodId);
    }
}
