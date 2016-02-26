<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include  file="../session_check.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="personal.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="fonts/glyphicons-halflings-regular.ttf">
    <script src="jquery-2.2.0.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <title>个人信息</title>
</head>
<body>
    <div class="jumbotron" style="margin:0px;background:url(./img/ps.jpg);background-size:100%">
    <center>
    <div id="container">
        <div id="back">
            <a style="color: #555;text-decoration: none;"href="AdminManagementPage.jsp">>>返回</a>
         </div>
         <center>
        <div id="white">
            <div id="h_line">个人信息</div>
            <div class="frame">
                <div class="input-group">
                <span class="input-group-addon">账号</span>
                <input type="text" class="form-control" >
                <span class="input-group-addon" style="padding:0px">
                <button type="button" class="btn btn-default">
                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                </button>      
                </span>
                </div>
            </div>
             <div class="frame">
                <div class="input-group">
                <span class="input-group-addon">性别</span>
                <input type="text" class="form-control">
                <span class="input-group-addon" style="padding:0px">
                <button type="button" class="btn btn-default">
                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                </button>      
                </span>
                </div>
            </div>
            <div class="frame">
                <div class="input-group">
                <span class="input-group-addon">电话</span>
                <input type="text" class="form-control">
                <span class="input-group-addon" style="padding:0px">
                <button type="button" class="btn btn-default">
                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                </button>      
                </span>
                </div>
            </div>
            <div class="frame">
                <div class="input-group">
                <span class="input-group-addon">地址</span>
                <input type="text" class="form-control">
               <span class="input-group-addon" style="padding:0px">
                <button type="button" class="btn btn-default">
                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                </button>      
                </span>
                </div>     
            </div>
      </div>
      </center>
     </div>
    </div>
</body>
</html>