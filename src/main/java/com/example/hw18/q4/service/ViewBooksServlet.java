package com.example.hw18.q4.service;

import com.example.hw18.q4.entity.Book;
import com.example.hw18.q4.manager.BookManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ViewBookServlet")
public class ViewBooksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        BookManager bookManager = new BookManager();
        List<Book> books = bookManager.loadAll();
        out.print("<table border='1' width='100%'");
        out.print("<tr><th>Id</th><th>Title</th><th>Author</th><th>Publisher</th><th>Price</th><th>Edit</th><th>Delete</th></tr>");
        for (Book item : books) {
            out.print("<tr><td>" + item.getId() + "</td><td>" + item.getTitle() + "</td><td>" + item.getAuthor() + "</td><td>" + item.getPublisher() + "</td><td>" + item.getPrice() + "</td><td><a href='EditBookServlet?id=" + item.getId() + "'>edit</a></td><td><a href='DeleteBookServlet?id=" + item.getId() + "'>delete</a></td></tr>");
        }
        out.print("</table>");
        out.close();
    }
}
