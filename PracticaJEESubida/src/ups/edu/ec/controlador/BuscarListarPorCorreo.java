package ups.edu.ec.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;

/**
 * Servlet implementation class BuscarListarPorCorreo
 */
@WebServlet("/BuscarListarPorCorreo")
public class BuscarListarPorCorreo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarListarPorCorreo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TelefonoDAO shoppingBasketDAO = DAOFactory.getFactory().getTelefonoDAO();
		TelefonoDAO productDAO = DAOFactory.getFactory().getTelefonoDAO();
		
		//shoppingBasketDAO.createTable();
		
		
		Usuario usu1;
		Telefono tele1;
		
		String cedula = request.getParameter("buscar");
		
		
	    /*
		request.setAttribute("resultado", i);
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/JSPs/IniciadoSesion.jsp");
		rd.forward(request, response);
		*/
		
	
		request.setAttribute("resultado", shoppingBasketDAO.findByTelefonoId(cedula));
		request.getRequestDispatcher("/JSPs/IniciadoSesion.jsp").forward(request,  response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
