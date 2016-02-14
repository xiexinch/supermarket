package com.supermarkt;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Goods {
    private int id;  //商品ID
    private String name; //商品名
    private double price;  //商品价格
    private int stock;  //商品库存
    private Date production_date;  //出厂日期
	private String shelf_life;  //保质期
	private String factory;   //出厂厂商
	private static Connection conn=null; //创建数据库连接对象
	
	//创建数据库连接
	
	private static Connection getConn(){
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		conn = DriverManager.getConnection(
     				"jdbc:mysql://127.0.0.1:3306/supermarkt?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "123");
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return conn;
    }
	
	
	
	//get()以及set()方法
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getProduction_date() {
		return production_date;
	}
	public void setProduction_date(Date production_date) {
		this.production_date = production_date;
	}
	public String getShelf_life() {
		return shelf_life;
	}
	public void setShelf_life(String shelf_life) {
		this.shelf_life = shelf_life;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
}
