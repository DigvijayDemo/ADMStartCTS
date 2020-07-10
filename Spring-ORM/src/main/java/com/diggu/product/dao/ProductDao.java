package com.diggu.product.dao;
import java.util.List;

import com.diggu.product.entity.Product;

public interface ProductDao {

	List<Product> findAll();

	void saveProduct(Product prod);

	Product findById(int id);

	List<Product> findByName(String productName);

	Object updateProduct(Product newProduct) throws RuntimeException;

	void deleteById(int id);

}