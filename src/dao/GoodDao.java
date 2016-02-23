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
	//��ѯ������Ʒ
	public List<Goods> query(String order) throws Exception {
		Connection conn = DBUtil.getConnection(); //�������ݿ�
		//ִ��SQL���
		Statement stmt =  conn.createStatement();
		//���ز�ѯ���
		ResultSet rs = stmt.executeQuery("select * from goods order by "+order+" desc");
		//�洢����GOOD����
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
	//ɾ����Ʒ
	public void deleteGoods() {
		
	}
	//������Ʒ
	public void addGoods (Goods good) throws Exception {
		Connection conn = DBUtil.getConnection(); //�������ݿ�
		//ִ��SQL���
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













