package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supermarkt.Administrator;

import dao.AdminDao;

/**
 * Servlet implementation class RegistServlet
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Administrator admin = new Administrator();
		AdminDao adDao = new AdminDao();
		
		admin.setName(request.getParameter("username"));
		admin.setMypassword(request.getParameter("password"));
		admin.setSex(request.getParameter("sex"));
		admin.setPhone(request.getParameter("phone"));
		admin.setAddress(request.getParameter("address"));
		
		try {
			adDao.addAdmin(admin);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
