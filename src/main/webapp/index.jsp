<%@ page import="com.example.hw18.q4.manager.BookManager" %>
<%@ page import="com.example.hw18.q4.entity.Book" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
    <title>Library Manager</title>
    <style>
        body{
            display: flex;
            flex-direction: row;
            justify-content: center;
            justify-items: center;
            font-size: small;
        }


        tr, td, th {
            border: 1px solid gray;
            margin: 0;
            padding: 0.2rem;
        }

        th {
            background-color: black;
            color: white;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div class="center">
    <h3><%= "Add New Book" %>
    </h3>
<div>
    <form action="${pageContext.request.contextPath}/AddBooKServlet" method="post">
        <table>
            <tr>
                <td>Title</td>
                <td><input type="text" name="title"></td>
            </tr>
            <tr>
                <td>Author</td>
                <td><input type="text" name="author"></td>
            </tr>
            <tr>
                <td>Publisher</td>
                <td><input type="text" name="publisher"></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><input type="number" name="price"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save Book"></td>
            </tr>
        </table>
    </form>
</div>

    <br/>

    <%@ include file="view-book.jsp" %>
</div>
</body>
</html>