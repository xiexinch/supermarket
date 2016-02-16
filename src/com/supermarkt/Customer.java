package com.supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ArrayList LookUpOwnInformation() {
		this.getConn();
		String sql = "select * from custom where id="+this.NetId+"";
		@SuppressWarnings("rawtypes")
		ArrayList<Map> lists = new ArrayList<Map>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				@SuppressWarnings("rawtypes")
				Map map = new HashMap();
				map.put("id", rs.getInt("id"));
				map.put("name", rs.getString("name"));
				map.put("password", rs.getString("password"));
				map.put("sex", rs.getString("sex"));
				map.put("phone", rs.getString("phone"));
				map.put("address", rs.getString("address"));
				map.put("details", rs.getString("details"));
				lists.add(map);
			}
			return lists;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		}
		return lists;
	}
	
	//�˿������Ʒ��Ϣ
	@SuppressWarnings("unchecked")
	public ArrayList LookUpGoodsInformation() {
		this.getConn();
		String sql = "select * from goods";
		@SuppressWarnings("rawtypes")
		ArrayList<Map> lists = new ArrayList<Map>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				@SuppressWarnings("rawtypes")
				Map map = new HashMap();
				map.put("id", rs.getInt("id"));
				map.put("name", rs.getString("name"));
				map.put("price", rs.getDouble("price"));
				map.put("stock", rs.getString("stock"));
				map.put("production_date", rs.getDate("production_date"));
				map.put("shelf_life", rs.getString("shelf_life"));
				map.put("factory", rs.getString("factory"));
				lists.add(map);
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
