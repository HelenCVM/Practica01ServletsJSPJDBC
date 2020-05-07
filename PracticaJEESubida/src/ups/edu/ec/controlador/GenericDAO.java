package ups.edu.ec.controlador;

import java.util.List;

public interface GenericDAO<T, ID> {

	public void createTable();

	public void create(T entity);

	

	
}
