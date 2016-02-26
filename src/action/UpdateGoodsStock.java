package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.supermarket.*;
/**
 * Servlet implementation class UpdateGoodsStock
 */
@WebServlet("/UpdateGoodsStock")
public class UpdateGoodsStock extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateGoodsStock() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Administrator admin = (Administrator)request.getSession().getAttribute("user");
		System.out.println("updatestock");
		admin.updateGoodsStock(request.getParameter("goodsName"), Double.parseDouble(request.getParameter("newInfo")));
		response.sendRedirect("AdminManagementPage.jsp?myOrder="+ (String) request.getSession().getAttribute("order")  +"");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}