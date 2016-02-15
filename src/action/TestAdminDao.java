package action;

import java.util.List;

import com.supermarkt.Administrator;

import dao.AdminDao;

public class TestAdminDao {

	public static void main(String[] args) throws Exception {
		
		AdminDao adDao = new AdminDao();
		
		List<Administrator> ads= adDao.query();
		for (Administrator admin : ads) {
			System.out.println(admin.getName());
		}

	}

}
