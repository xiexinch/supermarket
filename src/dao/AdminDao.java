package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.supermarkt.*;
import db.DBUtil;

public class AdminDao {
	
	public void addAdmin() {
		Connection conn = DBUtil.getConnection();
	}
	public void updateAdmin() {
		
	}
	public void deleteAdmin() {
		
	}
	public List<Administrator> query() throws Exception {
		Connection conn = DBUtil.getConnection();
		Statement stmt =  conn.createStatement();
		ResultSet rs = stmt.executeQuery("select id,user,password,sex,phone,adress from administrators");
		List<Administrator> admins = new ArrayList<Administrator>();
		Administrator admin = null;
		while (rs.next()) {
			admin = new Administrator();
			admin.setNetId(rs.getInt("id"));
			admin.setName(rs.getString("user"));
			admin.setMypassword(rs.getString("password"));
			admin.setSex(rs.getString("sex"));
			admin.setPhone(rs.getString("phone"));
			admin.setAddress(rs.getString("adress"));
			
			admins.add(admin);
		}
		System.out.println(admins.toString());
		return admins;
	}
	public Administrator getAdmin() {
		
		return null;
	}
	
}

