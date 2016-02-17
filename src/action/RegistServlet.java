package action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supermarket.Administrator;

import dao.AdminDao;

/**
 * Servlet implementation class RegistServlet
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public RegistServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Administrator admin = new Administrator();
		AdminDao adDao = new AdminDao();
		boolean isExist = false;
		
		admin.setName(request.getParameter("username"));
		admin.setMypassword(request.getParameter("password"));
		admin.setSex(request.getParameter("sex"));
		admin.setPhone(request.getParameter("phone"));
		admin.setAddress(request.getParameter("address"));
		
		try { 
			//获取所有管理员
			List<Administrator> ads = adDao.query();
			for (Administrator ad : ads) {
				if (ad.getName().equals(admin.getName())) {
					isExist = true;
					request.getRequestDispatcher("../RegistFail.jsp").forward(request, response);
				}
			}
			if (isExist == false) {
				adDao.addAdmin(admin);
				response.sendRedirect(request.getContextPath() + "/Login.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
