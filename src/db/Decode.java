package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Decode {
    public static String UnlockCode(String psd) throws SQLException {
		Connection conn = DBUtil.getConnection();
		String sql = "select password('"+psd+"')";
		String decode = psd;
		java.sql.PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			decode = rs.getString("password('"+psd+"')");
			//System.out.println(decode);
		}
		return decode;
	}
}
