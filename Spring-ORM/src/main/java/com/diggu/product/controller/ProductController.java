package com.diggu.product.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.diggu.product.config.AppConfig;
import com.diggu.product.entity.Product;
import com.diggu.product.service.ProductService;

public class ProductController {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService ps = ac.getBean(ProductService.class);

		Product prod = new Product();
		prod.setProductId(2003);
		prod.setProductName("Blue Pen");
		prod.setPrice(45.45);

		ps.saveProduct(prod); // New Transaction

	}

}