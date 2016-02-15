package action;

import java.util.List;

import com.supermarkt.Administrator;

import dao.AdminDao;

public class TestAdminDao {

	public static void main(String[] args) throws Exception {
		
		AdminDao adDao = new AdminDao();
		
		Administrator a1 = new Administrator();
		a1.setNetId(5);
		a1.setName("jiji");
		a1.setMypassword("123");
		a1.setSex("ab");
		a1.setPhone("15211111111");
		a1.setAddress("hahahahaha207");
		
		adDao.addAdmin(a1);
	}

}
