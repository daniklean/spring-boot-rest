package com.daniklean.app.factories.services;

import com.daniklean.app.factories.dao.IFactoryDAO;
import com.daniklean.app.factories.entities.Factory;
import com.daniklean.app.factories.repository.IRepositoryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class FactoryServices implements IFactoryDAO {

    @Autowired
    private IRepositoryFactory repositoryFactory;

    @Override
    public Optional<Factory> findByID(Long id) {
        return this.repositoryFactory.findById(id);
    }

    @Override
    public List<Factory> findAll() {
        return (List<Factory>) this.repositoryFactory.findAll();
    }

    @Override
    public Factory save(Factory factory) {
        return this.repositoryFactory.save(factory);

    }

    @Override
    public void deleteById(Long id) {
        this.repositoryFactory.deleteById(id);
    }
}
