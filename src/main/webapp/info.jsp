<%@ page import="dto.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书详细信息</title>
</head>
<body>
    <%
        Book book= (Book) session.getAttribute("book_info");
        if(book.getPrice()==-1||book==null){
            out.print("查询失败，请检查图书名称");
        }
        else {
           out.print("Name:"+book.getName()+"<br/>Price:"+book.getPrice()+"<br/>Author:"+book.getAuthor());
        }
    %>
</body>
</html>
