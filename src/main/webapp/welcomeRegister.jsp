<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>欢迎！</title>
</head>
<body>
    <s:form action="findbook" method="post" name="myform">
    <s:textfield name="book_name" label="查询图书名称" cssStyle="width:160px;heigh:26px;"/>
        <s:submit value="查询"/>
    </s:form>
    <s:form action="allbook" method="post" name="myform2">
        <s:submit value="查询全体图书列表"/>
    </s:form>
</body>
</html>