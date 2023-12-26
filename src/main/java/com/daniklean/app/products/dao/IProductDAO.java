package com.daniklean.app.products.dao;

import com.daniklean.app.products.entities.Products;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


public interface IProductDAO {
    List<Products> findAll();

    Products save(Products products);

    List<Products> findByPrice(BigDecimal price);

    List<Products> findByPriceAndRange(
            BigDecimal minPrice,
            BigDecimal maxPrice
    );

    Optional<Products> findById(Long id);

    void deleteById(Long id);
}
