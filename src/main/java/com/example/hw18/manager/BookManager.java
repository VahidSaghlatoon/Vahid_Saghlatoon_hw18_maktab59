package com.example.hw18.manager;

import com.example.hw18.core.BaseDao;
import com.example.hw18.core.BaseService;
import com.example.hw18.dao.BookDao;
import com.example.hw18.entity.Book;

public class BookManager extends BaseService<Book, Integer> {

    public BookManager(){
        setBaseDao(new BookDao());
    }
}
