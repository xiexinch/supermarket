package db;

import java.sql.*;
import com.mysql.*;

@SuppressWarnings("unused")
public class DBUtil {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/supermarkt";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "wuhahaha";
	private static Connection conn = null;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn =  (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() {
		return conn;
	}
	public static void main(String[] args) throws Exception {
		//�������ݿ�
		
		Statement stmt =  conn.createStatement();
		ResultSet rs = stmt.executeQuery("select id from administrators");
		
		while (rs.next()) {
			System.out.println(rs.getString("id"));
		}
	}
}
