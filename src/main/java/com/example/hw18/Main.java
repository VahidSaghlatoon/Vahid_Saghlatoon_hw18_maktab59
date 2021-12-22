package com.example.hw18;

import com.example.hw18.entity.Book;
import com.example.hw18.manager.BookManager;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        List<Book> books = bookManager.loadAll();

        books.forEach(x-> System.out.println(x.toString()));

        Book book = bookManager.loadById(6);

        bookManager.delete(book);

        books.forEach(x-> System.out.println(x.toString()));
    }
}
