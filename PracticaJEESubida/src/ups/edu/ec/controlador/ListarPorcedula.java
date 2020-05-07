package ups.edu.ec.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListarPorcedula
 */
@WebServlet("/ListarPorcedula")
public class ListarPorcedula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarPorcedula() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UsuarioDAO shoppingBasketDAO = DAOFactory.getFactory().getUsuarioDAO();
		
		String cedula = request.getParameter("cedula");
		
        System.out.println(shoppingBasketDAO.read(cedula));
		request.setAttribute("resultado", shoppingBasketDAO.read(cedula));
		request.getRequestDispatcher("/JSPs/mostrarUsuarios.jsp").forward(request,  response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
