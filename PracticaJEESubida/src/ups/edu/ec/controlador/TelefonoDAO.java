package ups.edu.ec.controlador;

import java.util.List;
import java.util.Set;

import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;

public interface TelefonoDAO extends GenericDAO<Telefono ,Integer>{

	
	public abstract Set<Telefono> findByTelefonoId(String UsuarioId);
	
	public void update(Telefono entity);

	public void delete(Telefono num);

	
}
