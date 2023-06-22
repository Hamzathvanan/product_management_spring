package com.hamzath.ProductSpring;

import com.hamzath.ProductSpring.domain.Product;
import com.hamzath.ProductSpring.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);
		ProductService service = context.getBean(ProductService.class);
		service.show();
		for(
				Product p: service.getAllProducts()){
			System.out.println(p+"\n");
		}

	}
}
