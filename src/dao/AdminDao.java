package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.supermarket.*;

import db.DBUtil;

public class AdminDao {
	
	public void addAdmin(Administrator admin) throws SQLException {
		Connection conn = DBUtil.getConnection();
		String sql = "" + 
				" insert into administrators" + 
				" (id,user,password,sex,phone,adress)" + 
				" values(" + 
				" ?,?,?,?,?,?)";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setInt(1, admin.getNetId());
		ptmt.setString(2, admin.getName());
		ptmt.setString(3, admin.getMypassword());
		ptmt.setString(4, admin.getSex());
		ptmt.setString(5, admin.getPhone());
		ptmt.setString(6, admin.getAddress());
		ptmt.execute();
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
		return admins;
	}
	public Administrator getAdmin() {
		
		return null;
	}
	
}

