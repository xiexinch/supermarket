<%@ page contentType="text/html; charset=gb2312" pageEncoding="UTF-8"%>
<%@ page language="Java" %>
<%@ page import="com.mysql.jdbc.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=gb2312">
        <title>登录验证</title>
    </head>
<body>
<%
String name=request.getParameter("name");
String pwd=request.getParameter("password");
if(name.equals("hehe") && pwd.equals("hehe")){
%>
<jsp:forward page="information.jsp">
<jsp:param name="name" value="<%=name%>"/>
</jsp:forward>
<%
}
else
{
%>
<jsp:forward page="login.jsp">
<jsp:param name="name" value="<%=name%>"/>
</jsp:forward>
<%
}
%>
</body>
</html>