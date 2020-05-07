package ups.edu.ec.controlador;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.ec.modelo.Telefono;

/**
 * Servlet Filter implementation class Obtenercedula
 */
@WebFilter("/Obtenercedula")
public class Obtenercedula implements Filter {

    /**
     * Default constructor. 
     */
    public Obtenercedula() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TelefonoDAO shoppingBasketDAO = DAOFactory.getFactory().getTelefonoDAO();
		Telefono tel=new Telefono();
		String co=request.getParameter("codi");
		
		
		System.out.println(co);
		tel.setCodigo(Integer.parseInt(co));

		shoppingBasketDAO.delete(tel);
		request.setAttribute("codigo", tel);
		request.getRequestDispatcher("http://localhost:8080/PracticaJEE/JSPs/eliminar.jsp").forward(request,  response);
		//response.sendRedirect(request.getContextPath() + "http://localhost:10976/PracticaJEE/JSPs/eliminar.jsp");
		
	}

	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
