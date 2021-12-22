package com.example.hw18.service;

import com.example.hw18.entity.Book;
import com.example.hw18.manager.BookManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

@WebServlet("/AddBooKServlet")
public class AddBookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String publisher = req.getParameter("publisher");
        double price = Double.parseDouble(req.getParameter("price"));
        Book book = new Book(title, author, publisher, price);
        new BookManager().save(book);

        resp.sendRedirect("index.jsp");

    }


}
