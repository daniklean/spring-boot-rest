package com.daniklean.app.products.services;

import com.daniklean.app.products.dao.IProductDAO;
import com.daniklean.app.products.entities.Products;
import com.daniklean.app.products.repository.IRepositoryProducts;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Component
public class ProductServices implements IProductDAO {

    private IRepositoryProducts repositoryProducts;
    @Override
    public List<Products> findAll() {
        return (List<Products>) this.repositoryProducts.findAll();
    }

    @Override
    public Products save(Products products) {
        return this.repositoryProducts.save(products);
    }

    @Override
    public List<Products> findByPrice(BigDecimal price) {
        return this.repositoryProducts.findProductsByPrice(
                price
        );
    }

    @Override
    public List<Products> findByPriceAndRange(
            BigDecimal minPrice,
            BigDecimal maxPrice
    ) {
        return this.repositoryProducts.findProductsByPriceBetween(
                minPrice,
                maxPrice
        );
    }

    @Override
    public Optional<Products> findById(Long id) {
        return this.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        this.repositoryProducts.deleteById(id);
    }
}
