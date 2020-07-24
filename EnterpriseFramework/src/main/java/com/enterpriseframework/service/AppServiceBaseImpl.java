/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enterpriseframework.service;

import com.enterpriseframework.data.AuditedEntity;
import com.enterpriseframework.data.DataRepositoryImpl;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

/**
 *
 * @author Home
 * @param <T>
 */

public class AppServiceBaseImpl<T extends AuditedEntity> implements AppServiceBase<T>{

    @Inject protected DataRepositoryImpl<T> repository;
    @Override
    public T create(T t) {
        return repository.create(t);
    }

    @Override
    public T get(Class type, Object id) {
        return repository.get(type, id);
    }

    @Override
    public T update(T t) {
        return repository.update(t);
    }

    @Override
    public void delete(Class type, Object id) {
        repository.delete(type, id);
        
    }

    @Override
    public List getList(String queryName) {
        return repository.getWithNamedQuery(queryName);
    }

    @Override
    public List getList(String queryName, int resultLimit) {
       return repository.getWithNamedQuery(queryName,resultLimit);
    }

    @Override
    public List getList(String namedQueryName, Map parameters) {
        return repository.getWithNamedQuery(namedQueryName,parameters);
    }

    @Override
    public List getList(String namedQueryName, Map parameters, int resultLimit) {
      return repository.getWithNamedQuery(namedQueryName, parameters, resultLimit);
    }
    
}
