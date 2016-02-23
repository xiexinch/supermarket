package com.supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DBUtil;

public class Customer{
	private int NetId;  //�û���ID
    private String name; //�û���
    private String mypassword; //�û�����
    private String sex; //�û��Ա�
    private String phone; //�û��绰
    private String address; //�û�סַ
    private String details;
    private Connection conn=null; //�������ݿ����Ӷ���
    
    //�������ݿ�����
    
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
		NetId = netId;
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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	
	
	//�˿�����Լ�����Ϣ
	public Customer LookForCustomer() {
		DBUtil.getConnection();
		String sql = "select * from custom where id="+this.getNetId()+"";
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
	
	//�˿������Ʒ��Ϣ
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
}
