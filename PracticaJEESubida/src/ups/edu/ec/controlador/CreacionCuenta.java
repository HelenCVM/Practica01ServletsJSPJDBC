package ups.edu.ec.controlador;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;

/**
 * Servlet implementation class CreacionCuenta
 */
@WebServlet("/CreacionCuenta")
public class CreacionCuenta extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Usuario usu;
	private Telefono tele;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreacionCuenta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UsuarioDAO shoppingBasketDAO = DAOFactory.getFactory().getUsuarioDAO();
		TelefonoDAO productDAO = DAOFactory.getFactory().getTelefonoDAO();
		
		//shoppingBasketDAO.createTable();
		
		
		Usuario usu1;
		Telefono tele1;
		
		String cedula = request.getParameter("cedula");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String correo = request.getParameter("correo");
		String contrasena = request.getParameter("contrasena");
		
		usu1 = new Usuario(cedula,nombre,apellido,correo,contrasena);
		
		/*
		String numero = request.getParameter("numero");
		String tipo = request.getParameter("tipo");
		String operadora = request.getParameter("operadora");
		
		tele1 =new Telefono(2,numero,tipo,operadora);
		
		
		tele1.setUsuario(usu1);
		
		Set<Telefono> telefono = new HashSet<Telefono>();
		
		telefono.add(tele1);
		
		usu1.setTelefono(telefono);
		*/
		
		shoppingBasketDAO.create(usu1);
		//productDAO.create(tele1);
		
		//Genero un resultado
		String resultado = "Hola " + usu1;
		
		//Ponemos en el objeto request los datos que vamos a enviar al jsp
		request.setAttribute("resultado", resultado);
		
		//Redireccion a index.jsp
		request.getRequestDispatcher("/JSPs/cuenta.jsp").forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
