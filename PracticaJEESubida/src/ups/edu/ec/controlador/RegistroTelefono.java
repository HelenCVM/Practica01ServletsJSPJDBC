package ups.edu.ec.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;

/**
 * Servlet implementation class RegistroTelefono
 */
@WebServlet("/RegistroTelefono")
public class RegistroTelefono extends HttpServlet {
	private static final long serialVersionUID = 1L;
    int num=9;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroTelefono() {
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
		Usuario us=new Usuario();
		
		Usuario usu1;
		Telefono tele1=new Telefono();
		
		String cedula= request.getParameter("cedu");
		String numero = request.getParameter("numero");
		String tipo = request.getParameter("tipo");
		String operadora = request.getParameter("operadora");
		
		us.setCedula(cedula);
		
		//shoppingBasketDAO.create(usu1);
		//productDAO.create(tele1);
		
		//Genero un resultado
		
		tele1.setNumero(numero);
		tele1.setTipo(tipo);
		tele1.setOperadora(operadora);
        tele1.setUsuario(us);
        
		shoppingBasketDAO.create(tele1);
		//Ponemos en el objeto request los datos que vamos a enviar al jsp
		request.setAttribute("resultado", tele1);
		num++;
		//Redireccion a index.jsp
		request.getRequestDispatcher("/JSPs/registrar.jsp").forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
