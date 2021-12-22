package com.example.hw18.q4.dao;

import com.example.hw18.q4.core.BaseDao;
import com.example.hw18.q4.entity.Book;

public class BookDao extends BaseDao<Book,Integer> {
    @Override
    public Class<Book> getEntityClass() {
        return Book.class;
    }
}
