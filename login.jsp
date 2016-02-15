<%@ page contentType="text/html; charset=gb2312" pageEncoding="UTF-8"%>
<%@ page language="Java" %>
<%@ page import="com.mysql.jdbc.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<html>
<head>
    <link rel="stylesheet" href="login.css">
    <title>登录界面</title>
</head>
<script>
	function clc(){
		document.getElementById("name").value="";
		document.getElementById("password").value="";
        }//登录账号重置--清除
</script>
<body>
    <font>超市账户登录</font>
    <div id="container">
        <div id="background">
            <div id="login">用户登录</div>
            <form method="POST" action="check.jsp">
            <div id="frame">
                <span id="name1">账户</span>
                <input type="text" name="name" id="name" value="">   
            </div>
            <div id="frame">
                <span id="password1">密码</span>
                <input type="password" name="password" id="password" value="">   
            </div> 
            <input type="submit" name="Submit" value="登录">
            <input type="button" value="取消" onclick="clc()">
            </form>
            <div id="in"><a href="enroll.jsp" style="text-decoration: none;color:red;">用户注册</a></div>
        </div>
    </div>
</body>
</html>