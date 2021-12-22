package com.example.hw18.dao;

import com.example.hw18.core.BaseDao;
import com.example.hw18.entity.Book;

public class BookDao extends BaseDao<Book,Integer> {
    @Override
    public Class<Book> getEntityClass() {
        return Book.class;
    }
}
