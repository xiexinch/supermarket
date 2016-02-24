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

public class GoodDao {
	//查询所有商品
	public List<Goods> query(String order) throws Exception {
		Connection conn = DBUtil.getConnection(); //连接数据库
		//执行SQL语句
		Statement stmt =  conn.createStatement();
		//返回查询结果
		ResultSet rs = stmt.executeQuery("select * from goods order by "+order+" desc");
		//存储所有GOOD对象
		List<Goods> goods = new ArrayList<Goods>();
		Goods good = null;
		while (rs.next()) {
			good = new Goods();
			good.setId(rs.getInt("id"));
			good.setName(rs.getString("name"));
			good.setPrice(rs.getDouble("price"));
			good.setStock(rs.getInt("stock"));
			good.setProduction_date(rs.getDate("production_date"));
			good.setShelf_life(rs.getString("shelf_life"));
			good.setFactory(rs.getString("factory"));
			goods.add(good);
		   // System.out.println(good.getName());
		}
		return goods;
	}
	//删除商品
	public void deleteGoods() {
		
	}
	//增加商品
	public void addGoods (Goods good) throws Exception {
		Connection conn = DBUtil.getConnection(); //连接数据库
		//执行SQL语句
		String sql = "" + 
				" insert into goods" + 
				" (id,name,price,stock,production_date,shelf_life,factory)" + 
				" values(" + 
				" ?,?,?,?,?,?,?)";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setInt(1, good.getId());
		ptmt.setString(2, good.getName());
		ptmt.setDouble(3, good.getPrice());
		ptmt.setInt(4, good.getStock());
		ptmt.setDate(5, good.getProduction_date());
		ptmt.setString(6, good.getShelf_life());
		ptmt.setString(7, good.getFactory());
	}
	
	
}













