<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "javax.servlet.*" %>
<%@ page import="com.supermarket.Administrator"%>
<%
	Object obj = session.getAttribute("user");
	if(obj==null){
		request.setAttribute("tip","您没有登录!");
	request.getRequestDispatcher("./LoginFail.jsp").forward(request, response);
	}else{
		Administrator admin = (Administrator)obj;
	}
%>