package com.example.hw18.q4.manager;

import com.example.hw18.q4.core.BaseService;
import com.example.hw18.q4.dao.BookDao;
import com.example.hw18.q4.entity.Book;

public class BookManager extends BaseService<Book, Integer> {

    public BookManager(){
        setBaseDao(new BookDao());
    }
}
