package ups.edu.ec.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;

public class JDBCTelefonoDAO extends JDBCGenericDAO<Telefono ,Integer> implements TelefonoDAO{

	
	//SET GLOBAL time_zone = '-3:00';
	@Override
	public void createTable() {

		conexionDos.update("DROP TABLE IF EXISTS Telefono");
		conexionDos.update("CREATE TABLE Telefono (ID INT AUTO_INCREMENT, NUMERO VARCHAR(255), "
				+ "TIPO VARCHAR(255),OPERADORA VARCHAR(255), Usuario_CEDULA VARCHAR(255), PRIMARY KEY (ID), "
				+ "FOREIGN KEY(Usuario_CEDULA) REFERENCES Usuario(CEDULA))");
	}

	@Override
	public void create(Telefono telefono) {

		conexionDos.update("INSERT INTO Telefono VALUES (" + telefono.getCodigo() + ", '" + telefono.getNumero() + "', '"
				+ telefono.getTipo() + "', '" +  telefono.getOperadora() + "', '" + telefono.getUsuario().getCedula() + "')");

	}

	
	@Override
	public void update(Telefono telefono) {
		System.out.print("UPDATE Telefono SET NUMERO ='" +telefono.getNumero() + "' , TIPO ='" 
				+ telefono.getTipo() + "', OPERADORA='" +  telefono.getOperadora() + "' WHERE id=" + telefono.getCodigo() + " and Usuario_CEDULA='" + telefono.getUsuario().getCedula() + "';");
		
		conexionuno.update("UPDATE Telefono SET NUMERO ='" +telefono.getNumero() + "' , TIPO ='" 
				+ telefono.getTipo() + "', OPERADORA='" +  telefono.getOperadora() + "' WHERE id=" + telefono.getCodigo() + " and Usuario_CEDULA='" + telefono.getUsuario().getCedula() + "';");

	}
	
	

	@Override
	public void delete(Telefono num) {
		conexionuno.update("DELETE FROM Telefono WHERE id=" + num.getCodigo());
		
	}

	
	

	@Override
	public Set<Telefono> findByTelefonoId(String UsuarioId) {
        Telefono te=new Telefono();
		Set<Telefono> list = new HashSet<Telefono>();
		System.out.print("SELECT * FROM Telefono WHERE Usuario_CEDULA=" + '"' + UsuarioId +   '"');
		ResultSet rsProduct = conexionDos.query("SELECT * FROM Telefono WHERE Usuario_CEDULA=" + "'" + UsuarioId +  "'");
		try {
			
			
			while (rsProduct.next()) {
				       Telefono product = new Telefono(rsProduct.getInt("id"), rsProduct.getString("numero"),
						rsProduct.getString("tipo"),rsProduct.getString("operadora"),te.getUsuario());
				
				
				
				
				list.add(product);
				
			}
			
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCTelefonoDAO:findByTelefonoId): " + e.getMessage());
		}

		return list;
	}
	

	
	
	
}
