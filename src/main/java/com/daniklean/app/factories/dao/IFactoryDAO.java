package com.daniklean.app.factories.dao;

import com.daniklean.app.factories.entities.Factory;

import java.util.List;
import java.util.Optional;

public interface IFactoryDAO {

    Optional<Factory> findByID(Long id);

    List<Factory> findAll();

    Factory save(Factory factory);

    void deleteById(Long id);
}