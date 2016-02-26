package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.supermarket.Administrator;
/**
 * Servlet implementation class UpdateAdminInfo
 */
@WebServlet("/UpdateAdminInfo")
public class UpdateAdminInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAdminInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		/*request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
=======
>>>>>>> refs/remotes/TinkerAc/master
		Administrator admin = (Administrator)request.getSession().getAttribute("user");
		admin.setPhone(request.getParameter("phone"));
		admin.setAddress(request.getParameter("address"));
		admin.updateAdministratorsInformation(admin);
<<<<<<< HEAD
		request.setAttribute("info", "ä¿®æ”¹ä¿¡æ¯æˆåŠŸ");*/
	}

}
=======
		request.setAttribute("info", "ÐÞ¸ÄÍê³É");
	}

}
>>>>>>> refs/remotes/TinkerAc/master
