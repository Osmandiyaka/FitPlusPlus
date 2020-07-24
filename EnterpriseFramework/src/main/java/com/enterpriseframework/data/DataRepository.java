/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enterpriseframework.data;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Home
 * @param <T>
 */
public interface DataRepository<T extends AuditedEntity> {
    
    public  T create(T t);
    
    public   T get(Class type,Object id);
    
    public   T update(T t);
    
    public void delete(Class type,Object id);
    
    public List getWithNamedQuery(String queryName);
    
    public List getWithNamedQuery(String queryName,int resultLimit);
    
    public List getWithNamedQuery(String namedQueryName, Map parameters);
    
    public List getWithNamedQuery(String namedQueryName, Map parameters,int resultLimit);
}
