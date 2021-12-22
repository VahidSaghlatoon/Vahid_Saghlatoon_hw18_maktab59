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

@WebServlet("/EditBookServlet")
public class EditBookServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Update Book</h1>");
        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);

        BookManager bookManager = new BookManager();
        Book book = bookManager.loadById(id);

        out.print("<form action='EditBookServlet2' method='post'>");
        out.print("<table>");
        out.print("<tr><td></td><td><input type='hidden' name='id' value='" + book.getId() + "'/></td></tr>");
        out.print("<tr><td>Title:</td><td><input type='text' name='title' value='" + book.getTitle() + "'/></td></tr>");
        out.print("<tr><td>Author:</td><td><input type='tex' name='author' value='" + book.getAuthor() + "'/></td></tr>");
        out.print("<tr><td>Publisher:</td><td><input type='text' name='publisher' value='" + book.getPublisher() + "'/></td></tr>");
        out.print("<tr><td>Price:</td><td><input type='text' name='price' value='" + book.getPrice() + "'/></td></tr>");
        out.print("<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>");
        out.print("</table>");
        out.print("</form>");

        out.close();
    }
}
