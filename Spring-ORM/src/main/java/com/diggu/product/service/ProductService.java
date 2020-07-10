package com.diggu.product.service;

import java.util.List;

import com.diggu.product.entity.Product;

public interface ProductService {

	List<Product> findAll();

	void saveProduct(Product prod) throws RuntimeException;

	Product findById(int id);

	List<Product> findByName(String productName);

	Object updateProduct(Product newProduct) throws RuntimeException;

	void deleteById(int id);

}