package com.daniklean.app.factories.repository;

import com.daniklean.app.factories.entities.Factory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryFactory extends CrudRepository<Factory, Long> {

}
