package com.diggu.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diggu.product.dao.ProductDao;
import com.diggu.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	@Transactional
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	@Transactional // Required
	public void saveProduct(Product prod) throws RuntimeException {
		// step -1 - save Product
		productDao.saveProduct(prod); // step -1
		productDao.updateProduct(new Product());

	}

	@Override
	@Transactional
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return productDao.findById(id);
	}

	@Override
	@Transactional
	public List<Product> findByName(String productName) {
		// TODO Auto-generated method stub
		return productDao.findByName(productName);
	}

	@Override
	@Transactional // Required
	public Object updateProduct(Product newProduct) throws RuntimeException {

		// TODO Auto-generated method stub
		// Product prod=findById(newProduct.getProductId());
		// if(prod==null) {
		// return null;
		// }

		return productDao.updateProduct(newProduct);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		productDao.deleteById(id);
	}

}