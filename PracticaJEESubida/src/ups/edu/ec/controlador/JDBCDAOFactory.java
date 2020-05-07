package ups.edu.ec.controlador;

public class JDBCDAOFactory extends DAOFactory{

	@Override
	public void createTables() {
		this.getUsuarioDAO().createTable();
		this.getTelefonoDAO().createTable();
		

	}
	
	
	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new JDBCUsuarioDAO();
	}
	
	public TelefonoDAO getTelefonoDAO() {
		return new JDBCTelefonoDAO();
	}
	
	
}
