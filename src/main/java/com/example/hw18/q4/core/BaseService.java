package com.example.hw18.q4.core;

import java.util.List;

@SuppressWarnings("unchecked")
public  class BaseService<T extends BaseEntity<ID>, ID extends Number> {
    private BaseDao baseDao ;

    public  void setBaseDao(BaseDao baseDao){
        this.baseDao = baseDao ;
    };

    public void save(T entity){
        baseDao.save(entity);
    }

    public T loadById(ID id){
        return (T) baseDao.loadById(id);
    }

    public List<T> loadAll(){
        return baseDao.loadAll();
    }

    public void update(T entity){
        baseDao.update(entity);
    }

    public void delete(T entity){
        baseDao.delete(entity);
    }
}
