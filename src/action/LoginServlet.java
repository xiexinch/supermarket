package action;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.Decode;
import com.supermarket.Administrator;

import dao.AdminDao;

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
		boolean isExist = false;
		HttpSession session = request.getSession();
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		try{
			List<Administrator> ads = adDao.query();
			admin.setName(request.getParameter("username"));
			admin.setMypassword(request.getParameter("password"));
			for(Administrator ad : ads) {
				if(admin.getName().equals(ad.getName())) {
					isExist = true;
					if((Decode.UnlockCode(admin.getMypassword())).equals(ad.getMypassword())){
						session.setAttribute("user", ad);
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
