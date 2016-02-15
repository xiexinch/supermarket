<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="view/login.css">
<title>Insert title here</title>
</head>
<body>
	<center>
    <h1>登陆页</h1>
    <form action="action/Login" method="post" class="user">
        <div>
            <label>用户名</label>
            <input type="text" name="username" />
        </div>
        <div>
            <label>密码</label>
            <input type="password" name="password" />
        </div>
        <input type="submit" value="登陆"/>
        <input type="reset" value="取消"/>
    </form>
</center>
</body>
</html>