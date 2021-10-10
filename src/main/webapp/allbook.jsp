<%@ page import="java.util.Map" %>
<%@ page import="dto.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询全体图书</title>
</head>
<body>
    <%
        if(session.getAttribute("all_book")==null){
            out.print("查询失败");
        }
        else {
            out.print("全体图书<br/>");
            Map<String, Book> mp = (Map<String, Book>) session.getAttribute("all_book");
            for (String key: mp.keySet()
                 ) {
                Book rs=mp.get(key);
                out.print(rs.getName()+"<br/>");
            }
        }
    %>
</body>
</html>
