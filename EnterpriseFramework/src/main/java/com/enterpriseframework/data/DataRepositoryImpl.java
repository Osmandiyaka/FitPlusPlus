/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enterpriseframework.data;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@Local(DataRepository.class)
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class DataRepositoryImpl<T extends AuditedEntity> implements DataRepository<T>{

    @PersistenceContext
    EntityManager em;

    @Override
    public T create(T t) {
        em.persist(t);
        em.flush();
        em.refresh(t);
        return t;
    }

    @Override
    public T get(Class type, Object id) {
        return (T) em.find(type, id);
    }

    @Override
    public T update(T t) {
        return em.merge(t);
    }

    @Override
    public void delete(Class type, Object id) {
       Object ref = em.getReference(type, id);
       em.remove(ref);
    }

    @Override
    public List getWithNamedQuery(String queryName) {
        return this.em.createNamedQuery(queryName).getResultList();
    }

    @Override
    public List getWithNamedQuery(String queryName, int resultLimit) {
         return em.createNamedQuery(queryName).
                setMaxResults(resultLimit).
                getResultList();   
    }

    @Override
    public List getWithNamedQuery(String namedQueryName, Map parameters) {
         return getWithNamedQuery(namedQueryName, parameters, 0);
    }

    @Override
    public List getWithNamedQuery(String namedQueryName, Map parameters, int resultLimit) {
       
        Query query = this.em.createNamedQuery(namedQueryName);
        if(resultLimit > 0)
            query.setMaxResults(resultLimit);
        
        Set<Map.Entry<String, String>> rawParameters = parameters.entrySet();
        for (Entry entry : rawParameters) {
            Entry e=(Entry)
            query.setParameter((String) entry.getKey(), entry.getValue());
        }
        return query.getResultList();
    }
    
  
}
