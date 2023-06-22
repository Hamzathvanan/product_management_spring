package com.hamzath.ProductSpring.service;

import com.hamzath.ProductSpring.domain.Product;
import com.hamzath.ProductSpring.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    @Autowired
    ProductRepository db;

    public void show(){
        System.out.println("In Show");
    }

//    public void addProduct(Product p){
//
////        products.add(p);
//        db.save(p);
//    }
//
    public List<Product> getAllProducts(){
        return db.findAll();
    }
}
