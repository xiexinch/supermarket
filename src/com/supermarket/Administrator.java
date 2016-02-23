package com.supermarket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.*;

public class Administrator{
	
	private int NetId;  //用户的ID
    private String name; //用户名
    private String mypassword; //用户密码
    private String sex; //用户性别
    private String phone; //用户电话
    private String address; //用户住址
    private Connection conn=null; //创建数据库连接对象
    
    //链接到数据库
    
//    private Connection getConn(){
//    	try{
//    		Class.forName("com.mysql.jdbc.Driver");
//    		conn = DriverManager.getConnection(
//     				"jdbc:mysql://127.0.0.1:3306/supermarkt", "root", "wuhahaha");
//    	}catch(Exception e){
//    		e.printStackTrace();
//    	}
//    	return conn;
//    }
    
	public int getNetId() {
		return NetId;
	}
	public void setNetId(int netId) {
		this.NetId=netId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMypassword() {
		return mypassword;
	}
	public void setMypassword(String mypassword) {
		this.mypassword = mypassword;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
	//增加管理员
	
	public void addAdministrator() {
		try {
			DBUtil.getConnection();
			
			Statement sta = conn.createStatement();
			sta.execute("insert into administrators(id,user,password,sex,phone,adress) values(null,'"
			+this.name+"','"+Decode.UnlockCode(this.mypassword)+"','"+this.sex+"','"+this.phone+"','"+this.address+"')");
			sta.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//增加商品
	public void addGoodsInformation(Goods goods) {
		try {
			DBUtil.getConnection();
			Statement sta = conn.createStatement();
		    String sql= "insert into goods(id,name,price,stock,production_date,shelf_life,factory) values(null,'"
		    		+goods.getName()+"','"+goods.getPrice()+"','"+goods.getStock()+","
		    		+goods.getProduction_date().toString()+"','"+goods.getShelf_life()+"','"+goods.getFactory()+"')";
			sta.execute(sql);
			sta.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//修改商品价格
	public void updateGoodsPrice(String goodsName,double goodsPrice) {
		try {
			DBUtil.getConnection();
			Statement sta = conn.createStatement();
			String sql = "update goods set price="+goodsPrice+" where name='"+goodsName+"'";
			sta.executeUpdate(sql);
			sta.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//修改商品库存
		public void updateGoodsStock(String goodsName,double goodsStock) {
			try {
				DBUtil.getConnection();
				Statement sta = conn.createStatement();
				String sql = "update goods set price="+goodsStock+" where name='"+goodsName+"'";
				int count = sta.executeUpdate(sql);
				sta.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	//删除管理员
	public void deleteAdministrators() {
		try {
			DBUtil.getConnection();
			Statement sta = conn.createStatement();
			String sql = "delete from administrators where name='"+this.name+"'";
			int count = sta.executeUpdate(sql);
			sta.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//修改管理员信息
	public void updateAdministratorsInformation(Administrator ad) {
		try {
			DBUtil.getConnection();
			Statement sta = conn.createStatement();
			String sql="update administrators set user='"+ad.name+"',password='"
			            +Decode.UnlockCode(ad.mypassword)+"',sex='"+ad.sex+"',phone='"+ad.phone
			            +"',adress='"+ad.address+"'";
			int count = sta.executeUpdate(sql);
			sta.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//删除商品信息
	public void deleteGoodsInformation(Goods goods) {
		try {
			DBUtil.getConnection();
			Statement sta = conn.createStatement();
			String sql = "delete from goods where id='"+goods.getId()+"'";
			int count = sta.executeUpdate(sql);
			sta.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//浏览货物信息
	public ArrayList<Goods> LookUpGoodsInformation() {
		DBUtil.getConnection();
		String sql = "select * from goods";
		ArrayList<Goods> lists = new ArrayList<Goods>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Goods goods = new Goods();
				goods.setId(rs.getInt("id"));
				goods.setName(rs.getString("name"));
				goods.setPrice(rs.getDouble("price"));
				goods.setStock(rs.getInt("stock"));
				goods.setProduction_date(rs.getDate("production_date"));
				goods.setShelf_life(rs.getString("shelf_life"));
				goods.setFactory(rs.getString("factory"));
				lists.add(goods);
			}
			return lists;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		}
		return lists;
	}
	
	//增加顾客
	
		public void addCustoms(Customer customer){
			try {
				DBUtil.getConnection();
				Statement sta = conn.createStatement();
			    String sql= "insert into goods(id,name,password,sex,phone,address,details) values(null,'"
			    		+customer.getName()+"','"+Decode.UnlockCode(customer.getMypassword())+"','"+customer.getSex()+","
			    		+customer.getPhone()+"','"+customer.getAddress()+"','"+customer.getDetails()+"')";
				boolean temp = sta.execute(sql);
				sta.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	//删除顾客资料
		public void deleteCustomer(Customer customer) {
			try {
				DBUtil.getConnection();
				Statement sta = conn.createStatement();
				String sql = "delete from custom where id="+customer.getNetId()+"";
				int count = sta.executeUpdate(sql);
				sta.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	//查询顾客
		public Customer LookForCustomer(Customer customer) {
			DBUtil.getConnection();
			String sql = "select * from custom where id="+customer.getNetId()+"";
			Customer cus = new Customer();
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					cus.setNetId(rs.getInt("id"));
				    cus.setName(rs.getString("name"));
					cus.setMypassword(rs.getString("password"));
					cus.setSex(rs.getString("sex"));
					cus.setPhone(rs.getString("phone"));
					cus.setAddress(rs.getString("address"));
					cus.setDetails(rs.getString("details"));
				}
				return cus;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
			}
			return cus;
		}
	
		
	//浏览所有顾客信息
		public ArrayList<Customer> LookForAllCustomer() {
			DBUtil.getConnection();
			String sql = "select * from custom";
			ArrayList<Customer> lists = new ArrayList<Customer>();
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					Customer cus = new Customer();
					cus.setNetId(rs.getInt("id"));
				    cus.setName(rs.getString("name"));
					cus.setMypassword(rs.getString("password"));
					cus.setSex(rs.getString("sex"));
					cus.setPhone(rs.getString("phone"));
					cus.setAddress(rs.getString("address"));
					cus.setDetails(rs.getString("details"));
					lists.add(cus);
				}
				return lists;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
			}
			return lists;
		}
	
}
