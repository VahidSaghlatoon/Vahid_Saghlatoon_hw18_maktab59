<%@ page import="com.example.hw18.q4.manager.BookManager" %>
<%@ page import="com.example.hw18.q4.entity.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Neva-L
  Date: 12/20/2021
  Time: 3:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8"  %>--%>
<%
    BookManager bookManager = new BookManager();
    List<Book> books = bookManager.loadAll();

%>
<html>
<head>
    <title>View Books</title>
    <link rel="stylesheet" href="WEB-INF/lib/bootstrap/css/bootstrap.css">
<%--    <style>--%>
<%--        div {--%>
<%--            display: block;--%>
<%--            margin: 0 auto;--%>
<%--        }--%>

<%--        tr, td, th {--%>
<%--            border: 1px solid gray;--%>
<%--            margin: 0;--%>
<%--            padding: 0.5rem;--%>
<%--        }--%>

<%--        th {--%>
<%--            background-color: black;--%>
<%--            color: white;--%>
<%--            font-weight: bold;--%>
<%--        }--%>
<%--    </style>--%>
</head>
<body>
<div>
    <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Author</th>
            <th>Publisher</th>
            <th>Price</th>
            <th>Edit</th>
            <th>Remove</th>
        </tr>
        </thead>
        <tbody>
        <%
            for (Book book : books) { %>
        <tr>
            <td><%= book.getId()%>
            </td>
            <td><%= book.getTitle()%>
            </td>
            <td><%= book.getAuthor()%>
            </td>
            <td><%= book.getPublisher()%>
            </td>
            <td><%= book.getPrice()%>
            </td>
            <td><a href="EditBookServlet?id=<%= book.getId()%>">Edit</a></td>
            <td><a href="DeleteBookServlet?id=<%= book.getId()%>">Remove</a></td>
        </tr>

        <% }%>
        </tbody>
    </table>
</div>

</body>
</html>
