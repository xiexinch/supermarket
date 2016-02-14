package com.supermarkt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Administrator{
	
	private int NetId;  //用户的ID
    private String name; //用户名
    private String mypassword; //用户密码
    private String sex; //用户性别
    private String phone; //用户电话
    private String address; //用户住址
    private Connection conn=null; //创建数据库连接对象
    
    //链接到数据库
    
    private Connection getConn(){
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		conn = DriverManager.getConnection(
     				"jdbc:mysql://127.0.0.1:3306/supermarkt", "root", "wuhahaha");
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return conn;
    }
    
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
			this.getConn();
			
			Statement sta = conn.createStatement();
			sta.execute("insert into administrators(id,user,password,sex,phone,adress) values(null,'"
			+this.name+"','"+this.mypassword+"','"+this.sex+"','"+this.phone+"','"+this.address+"')");
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//增加商品
	public void addGoodsInformation() {
		try {
			this.getConn();
			Statement sta = conn.createStatement();
		  //  String sql=;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//修改商品信息
	public void updateGoodsInformation() {
		
	}
	
	//删除管理员
	public void deleteAdministrators() {
		
	}
	
	//修改管理员信息
	public void updateAdministratorsInformation() {
		
	}
	
	//删除商品信息
	public void deleteGoodsInformation() {
		
	}
	
	//浏览货物信息
	public void LookUpGoodsInformation() {
		
	}
	
	//浏览顾客信息
	public void LookUpCustomInformation() {
		
	}
	
}
