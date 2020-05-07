package ups.edu.ec.modelo;

import java.io.Serializable;
import java.util.Set;

public class Usuario implements Serializable{

	private static final long serialVersionUID =1L;
	private String cedula;
	private String nombre;
	private String apellido;
	private String correo;
	private String contraseña;
	private Set<Telefono>telefono;
	
	public Usuario() {
		
	}
	
	public Usuario(String cedula,String nombre,String apellido,String correo ,String contraseña) {
		this.cedula=cedula;
		this.nombre=nombre;
		this.apellido=apellido;
		this.correo=correo;
		this.contraseña=contraseña;
	}
	
	
	
	
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Set<Telefono> getTelefono() {
		return telefono;
	}
	public void setTelefono(Set<Telefono> telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + "]";
	}
	
	
	
	
}
