package com.daniklean.app.products.repository;

import com.daniklean.app.products.entities.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IRepositoryProducts extends CrudRepository<Products, Long> {

    //QueryMethods JDP Match
    List<Products> findProductsByPrice(BigDecimal price);

    List<Products> findProductsByPriceBetween(
            BigDecimal min,
            BigDecimal max
    );

    // QuerySQL JPDSQL
    @Query("SELECT price FROM Products WHERE price BETWEEN ?1 AND ?2")
    List<Products> findProductsByPriceRangeQuery(
            BigDecimal min,
            BigDecimal max
    );
}
