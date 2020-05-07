package ups.edu.ec.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.ec.modelo.Telefono;

/**
 * Servlet implementation class Obtener
 */
@WebServlet("/Obtener")
public class Obtener extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Obtener() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TelefonoDAO shoppingBasketDAO = DAOFactory.getFactory().getTelefonoDAO();
		Telefono tel=new Telefono();
		String co=request.getParameter("codi");
		
		
		System.out.println(co);
		tel.setCodigo(Integer.parseInt(co));

		shoppingBasketDAO.delete(tel);
		request.setAttribute("codigo", tel);
		request.getRequestDispatcher("/JSPs/eliminar.jsp").forward(request,  response);
		//response.sendRedirect(request.getContextPath() + "http://localhost:10976/PracticaJEE/JSPs/eliminar.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
