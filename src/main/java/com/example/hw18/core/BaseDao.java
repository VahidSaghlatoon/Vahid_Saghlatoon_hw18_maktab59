package com.example.hw18.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.Set;

public abstract class BaseDao<T extends BaseEntity<ID>, ID extends Number> {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();



    public EntityManager getEntityManager() {
        return entityManager;
    }

    public abstract Class<T> getEntityClass();

    public void save(T entity){
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(entity);
        getEntityManager().getTransaction().commit();
//        getEntityManager().close();
    }

    public T loadById(ID id){
        getEntityManager().getTransaction().begin();
        T result = getEntityManager().find(getEntityClass(), id);
        getEntityManager().getTransaction().commit();
//        getEntityManager().close();
        return result;
    }

    public List<T> loadAll(){
        getEntityManager().getTransaction().begin();
        Query query = getEntityManager().createQuery("From " + getEntityClass().getSimpleName());
        getEntityManager().getTransaction().commit();
        return  query.getResultList();
    }

    public void update(T entity){
        getEntityManager().getTransaction().begin();
        getEntityManager().merge(entity);
        getEntityManager().getTransaction().commit();
//        getEntityManager().close();
    }

    public void delete(T entity){
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(entity);
        getEntityManager().getTransaction().commit();
//        getEntityManager().close();
    }

}
