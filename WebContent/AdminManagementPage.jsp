<<<<<<< HEAD
<%@page import="java.nio.channels.SeekableByteChannel"%>
=======
>>>>>>> refs/remotes/TinkerAc/master
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
<<<<<<< HEAD
<link rel="stylesheet" href="./information.css">
=======
<link rel="stylesheet" href="information.css">
>>>>>>> refs/remotes/TinkerAc/master
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="jquery-2.2.0.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <title>商品信息</title>
</head>
<<<<<<< HEAD
<script>
    function changecolor(obj){
        obj.style.color="red";
    }
    function recovercolor(obj){
        obj.style.color="black";
    }
    function priceclick(obj){
    	var id = obj.dataset["id"];
        document.getElementById("myModalLabel"+id).innerHTML="价格";
        document.getElementById("sizing-addon1"+id).innerHTML="请输入价格";
        document.getElementById("form-control-id"+id).placeholder="新的价格";
        //var child = document.querySelectorAll("c_button");
       /*  var parent = obj.parentNode;
        var uncle = parent.previousSibling;
        document.getElementsByName("goodsName").value = uncle.valueOf();  */
    }
    function stockclick(obj){
    	var id = obj.dataset["id"];
    document.getElementById("myModalLabel"+id).innerHTML="库存";
    document.getElementById("sizing-addon1"+id).innerHTML="请输入库存";
    document.getElementById("form-control-id"+id).placeholder="新的库存";
    }
       
     $(function(){
         $('.juti:odd').css('background-color','#ebebeb');  
     });
     
     
     function setLocation(obj) {
     	var id = obj.dataset["id"];
		var myLocation = document.getElementById("form-control-id"+id).placeholder;
		if(myLocation=="新的价格")
		{
			document.getElementById("myForm"+id).action = "UpdateGoodsPrice";
		}
		else {
			document.getElementById("myForm"+id).action = "UpdateGoodsStock";
		}
	   }
     
</script>
<body>

    <%! String location = "UpdateGoodsPrice";%>
        
=======
<body>
>>>>>>> refs/remotes/TinkerAc/master
    <div id="container">
    <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
<<<<<<< HEAD
      <a class="navbar-brand">
      <%= ((Administrator) session.getAttribute("user")).getName() %>
      </a>
=======
      <a class="navbar-brand">name</a>
>>>>>>> refs/remotes/TinkerAc/master
    </div>
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="#">增加商品<span class="sr-only"></span></a></li>
<<<<<<< HEAD
        <div style="display:inline-block;decoration:none;margin: 7px 20px;"><form action="AdminManagementPage.jsp" method="get" "><button class="btn btn-default" type="submit" name="myOrder" value="price" >按价格排序</button></form></div>
       <div style="display:inline-block;decoration:none;margin: 7px 0px;"><form action="AdminManagementPage.jsp" method="get" "><button class="btn btn-default" type="submit" name="myOrder" value="stock" >按库存排序<span class="sr-only"></span></button></form></div> 
      </ul>
       <form class="navbar-form navbar-left" role="search">
        <div class="form-group" style="margin-left:120px">
=======
        <li><a href="#" sytle="margin-right:200px">link</a></li>
        <li class="dropdown"><a></a></li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
>>>>>>> refs/remotes/TinkerAc/master
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">搜索</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
<<<<<<< HEAD
        <li><a href="#">
        <%=  ((Administrator)session.getAttribute("user")).getName() %>
        </a></li><!--登陆者信息-->
=======
        <li><a href="#">name</a></li><!--登陆者信息-->
>>>>>>> refs/remotes/TinkerAc/master
        <li class="dropdown">
         <a id="dLabel" role="button" data-toggle="dropdown" data-target="#" href="/page.html">更多<span class="caret"></span>
          <ul class="dropdown-menu" role="menu" style="color:#666">
            <center>
<<<<<<< HEAD
            <li><a href="personalInfo.jsp" style="text-decoration:none;">个人信息</a></li>
            <li><a href="#" style="text-decoration:none">修改密码</a></li>
=======
            <li><a href="#" style="text-decoration:none;">个人信息</a></li>
            <li><a href="#" style="text-decoration:none">重新登录</a></li>
>>>>>>> refs/remotes/TinkerAc/master
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
<<<<<<< HEAD
            <div class="juti">
=======
            <div class="information">
              <form method="get">
                 <button type="submit" name="myorder" value="price">price</button>
                 <button type="submit" name="myorder" value="stock">stock</button>
              </form>
                <div class="menu">
>>>>>>> refs/remotes/TinkerAc/master
                    <span class="id">产品ID</span>
                    <span class="name">名称</span>
                    <span class="price">价格</span>
                    <span class="stock">库存</span>
                    <span class="productor">厂商</span>
                    <span class="date1">生产日期</span>
                    <span class="date2">保质期</span>
<<<<<<< HEAD
            </div>
                <%
                    GoodDao goodsDao = new GoodDao();
                    String order = (String) request.getParameter("myOrder");
=======
                </div>
            </div>
                <%
                    GoodDao goodsDao = new GoodDao();
                    String order = (String) request.getAttribute("myorder");
>>>>>>> refs/remotes/TinkerAc/master
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
<<<<<<< HEAD
                <form method="get" id="myForm<%=id %>">
                 <div class="juti">
                    <span class="id"><%=id %></span>
                    <span class="name"><%-- <input type="hidden" value=<%=name %> >  --%> <%=name %></span>                    
                     <span class="price">
                        <a onclick="priceclick(this)" data-id="<%=id %>" onmouseover="changecolor(this)" onmouseout="recovercolor(this)" 
                        class="c_button" tyle="" data-toggle="modal" data-target="#myModal<%=id %>"><%=price %></a>
                        <div class="modal fade" id="myModal<%=id %>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                        <div class="modal-dialog" role="document">
                        <div class="modal-content">
                        <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel<%=id %>"></h4>
                        </div>
                        
                        <div class="form-group">
                        <!--<input type="text" class="form-control" id="recipient-name">-->
                        <div class="input-group input-group-lg">
                        <span class="input-group-addon" id="sizing-addon1<%=id %>"></span>
                        <input type="hidden" value="<%=name %>" name="goodsName">
                        <input type="text" class="form-control" data-id="<%=id %>" onfocus="setLocation(this)" name="newInfo" 
                        id="form-control-id<%=id %>"  aria-describedby="sizing-addon1">
                        </div>
                        </div>
                        
                        <div class="modal-footer">
                        <button type="submit" class="btn btn-primary">确认更改</button></form>
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        </div>
                        </div>
                        </div>
                        </div>

                    </span>
                    <span class="stock">
                        <a data-id="<%=id %>" onclick="stockclick(this)" class="s_button"  onmouseover="changecolor(this)" 
                        onmouseout="recovercolor(this)" data-toggle="modal" data-target="#myModal<%=id %>"><%= stock %></a>
                        </span>
=======
                 <div class="juti">
                    <span class="id"><%=id %></span>
                    <span class="name"><%=name %></span>
                    <span class="price"><%=price %></span>
                    <span class="stock"><%=stock %></span>
>>>>>>> refs/remotes/TinkerAc/master
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