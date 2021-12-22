package com.example.hw18.q4.service;

import com.example.hw18.q4.entity.Book;
import com.example.hw18.q4.manager.BookManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/DeleteBookServlet")
public class DeleteBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid = req.getParameter("id");
        int id = Integer.parseInt(sid);
        BookManager bookManager = new BookManager();
        Book book = bookManager.loadById(id);
        bookManager.delete(book);
        resp.sendRedirect("index.jsp");
    }
}
