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

@WebServlet("/EditBookServlet2")
public class EditBookServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String sId = request.getParameter("id");
        int id = Integer.parseInt(sId);
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String publisher = request.getParameter("publisher");
        String sPrice = request.getParameter("price");
		double price = Double.parseDouble(sPrice);

        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setPrice(price);

		BookManager bookManager = new BookManager();
		bookManager.update(book);

            response.sendRedirect("index.jsp");


        out.close();
    }

}
