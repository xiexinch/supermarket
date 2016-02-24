package action;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.supermarket.*;

import dao.AdminDao;

@WebServlet("/AddGoodsServlet")
public class AddGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Administrator admin = new Administrator();
		Goods newGoods = new Goods();
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		newGoods.setName(request.getParameter("name")); 
		newGoods.setPrice((Double) request.getAttribute("price"));
		newGoods.setStock((Integer) request.getAttribute("stock"));
		newGoods.setProduction_date((Date) request.getAttribute("production_date"));
		newGoods.setShelf_life(request.getParameter("shelf_life"));
		newGoods.setFactory(request.getParameter("factory")); 
		
		ArrayList<Goods> allGoods = admin.LookUpGoodsInformation();
		boolean isExist = false;
		for(Goods goods:allGoods){
			if(goods.getName().equals(newGoods.getName())&&goods.getFactory().equals(newGoods.getFactory()))
				{
				  request.getRequestDispatcher("").forward(request, response);
				  isExist = true;
				}
		}
		if(!isExist){
			admin.addGoodsInformation(newGoods);
			request.getRequestDispatcher("").forward(request, response);
		}
	}
}
