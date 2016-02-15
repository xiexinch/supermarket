package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supermarkt.Administrator;
import dao.AdminDao;
import db.DBUtil;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Administrator admin = new Administrator();
		AdminDao adDao = new AdminDao();
		String username,password;
		boolean isExist = false;
		try{
			List<Administrator> ads = adDao.query();
			username = request.getParameter("username");
			password = request.getParameter("password");
			
			admin.setName(username);
			admin.setMypassword(password);
			for(Administrator ad : ads) {
				if(admin.getName().equals(ad.getName())) {
					isExist = true;
					if(admin.getMypassword().equals(ad.getMypassword())){
						request.getRequestDispatcher("../LoginSuccess.jsp").forward(request, response);
					}else {
						request.getRequestDispatcher("../LoginFail.jsp").forward(request, response);
					}
				}
			}
			if (isExist == false) {
				request.getRequestDispatcher("../LoginFail.jsp").forward(request, response);
			}
			
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
		
	}

}
