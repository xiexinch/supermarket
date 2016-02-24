<%@ include  file="../session_check.jsp"%>
<%@page import="dao.GoodDao"%>
<%@page import="com.supermarket.Goods"%>
<%@page import="java.util.List"%>
<%@page import="db.DBUtil"%>
<%@page import="dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=uft-8">
<link rel="stylesheet" href="information.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="jquery-2.2.0.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <title>商品信息</title>
</head>
<body>
    <div id="container">
    <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <a class="navbar-brand">name</a>
    </div>
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="#">增加商品<span class="sr-only"></span></a></li>
        <li><a href="#" sytle="margin-right:200px">link</a></li>
        <li class="dropdown"><a></a></li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">搜索</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">name</a></li><!--登陆者信息-->
        <li class="dropdown">
         <a id="dLabel" role="button" data-toggle="dropdown" data-target="#" href="/page.html">更多<span class="caret"></span>
          <ul class="dropdown-menu" role="menu" style="color:#666">
            <center>
            <li><a href="#" style="text-decoration:none;">个人信息</a></li>
            <li><a href="#" style="text-decoration:none">重新登录</a></li>
            <li><a href="#" style="text-decoration:none">注销</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#" style="text-decoration:none">删除此账户</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav><!--导航栏-->
        <span id="myimg">
         <img src="img/jj.png" alt="佳慧，机机">
        </span>
        <span id="goods">
            <center>
            <div class="information">
              <form method="get">
                 <button type="submit" name="myorder" value="price">price</button>
                 <button type="submit" name="myorder" value="stock">stock</button>
              </form>
                <div class="menu">
                    <span class="id">产品ID</span>
                    <span class="name">名称</span>
                    <span class="price">价格</span>
                    <span class="stock">库存</span>
                    <span class="productor">厂商</span>
                    <span class="date1">生产日期</span>
                    <span class="date2">保质期</span>
                </div>
            </div>
                <%
                    GoodDao goodsDao = new GoodDao();
                    String order = (String) request.getAttribute("myorder");
                    if(order==null){
                    	order = "id";
                    }
                    List<Goods> allGoods = goodsDao.query(order);
                    for(Goods goods:allGoods){
                    	int id = goods.getId();
                    	String name = goods.getName();
                    	double price = goods.getPrice();
                    	int stock = goods.getStock();
                    	String production_date = goods.getProduction_date().toString();
                    	String shelf_life = goods.getShelf_life();
                    	String factory = goods.getFactory();
                %>
                 <div class="juti">
                    <span class="id"><%=id %></span>
                    <span class="name"><%=name %></span>
                    <span class="price"><%=price %></span>
                    <span class="stock"><%=stock %></span>
                    <span class="productor"><%=factory %></span>
                    <span class="date1"><%=production_date %></span>
                    <span class="date2"><%=shelf_life %></span>
                </div>
                <%     
                   } 
                %>
                </center>
            
        </span>
        <div id="deadline"></div>
    </div>

</body>
</html>