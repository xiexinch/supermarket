<%@ include  file="../session_check.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>个人信息</title>
</head>
<body>
<form action="UpdateAdminInfo" method="post">
	<label>电话</label><input type="text" name="phone">
	<label>地址</label><input type="text" name="address">
	<input type="submit" value="提交">
</form>


</body>
</html>