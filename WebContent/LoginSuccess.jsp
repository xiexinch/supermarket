<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8"> 
<title>登陆成功</title> 
</head> 
<body>
<script> 
var t=3;
var str="登陆成功!";
setInterval("refer()",1000);  
function refer(){
if(t==0){ 
location="../AdminManagementPage.jsp"; 
} 
if(t<0){
    location="../Login.jsp"; 
    t=0;
    str="您将跳回登录页面~";
}
document.getElementById('show').innerHTML=str+t+"s后跳转"; 
t--;
} 
</script> 
<center><div id="show" style="color:#666;padding:200px;font-size:25px"></div></center> 
</body>
</html>