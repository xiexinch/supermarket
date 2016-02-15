<%@ page contentType="text/html; charset=gb2312" pageEncoding="UTF-8"%>
<%@ page language="Java" %>
<%@ page import="com.mysql.jdbc.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>

<html>
<head>
    <link rel="stylesheet" href="enroll.css">
    <title>登录界面</title>
</head>
<!--<script>
	function clc(){
		document.getElementById("name").value="";
		document.getElementById("password").value="";
        }//登录账号重置--清除
</script>-->
<body>

        <div id="container">
        <div id="login">
            <a style="color: #555;text-decoration: none;"href="login.jsp">>>登录</a>
            </div>
        <div id="white">
            <center>
            <div id="frame">
                <span id="word">用户账号</span>
                <input type="text">
                <span style="color:red">*</span>
            </div>
             <div id="frame">
                <span id="word">账号密码</span>
                <input type="password">
                <span style="color:red">*</span>
            </div>
            <div id="frame">
                <span id="word">性别</span>
                <span>
                <!--<form>-->
                <input type="radio" name="sex" value="male" />男
                <input type="radio" name="sex" value="female" /> 女
                <!--</form>-->
                </span>
            </div>
            <div id="frame">
                <span id="word">电话号码</span>
                <input type="text">
                <span style="color:red">*</span>
            </div>
            <div id="frame">
                <span id="word">家庭住址</span>
                <input type="text">
                <span style="color:red">*</span>
            </div>
            <div id="frame">
                <input type="submit" name="Submit" style="width:150px;height:30px" value="注册">
            </div>
            </center>
        </div>
    </div>
</body>
</html>