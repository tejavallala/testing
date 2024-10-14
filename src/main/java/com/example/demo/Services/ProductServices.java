package com.example.demo.Services;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServices {

@Autowired
    ProductRepo productRepo;
    public List<Product>getProducts(){
      return productRepo.findAll();
    }

    public Product getProductById(int prodId) {
        return productRepo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product product){
        productRepo.save(product);
    }
    public  void updateProduct(Product product){
        productRepo.save(product);
    }
    public void  deleteProduct(int prodId){
       productRepo.deleteById(prodId);
    }
}
