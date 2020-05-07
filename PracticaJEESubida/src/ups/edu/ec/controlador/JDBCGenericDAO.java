package ups.edu.ec.controlador;

public abstract class JDBCGenericDAO<T, ID> implements GenericDAO<T, ID>{

	protected ContextJDBC conexionuno=ContextJDBC.getJDBC1();
	protected ContextJDBC conexionDos = ContextJDBC.getJDBC2();
}
