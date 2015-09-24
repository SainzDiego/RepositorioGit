package Modelo;

import java.sql.SQLException;
import Controlador.Conexion_Singleton;

public class Usuario extends Persona{
	
	private int idUsuario;
	private String nombreU;
	private String cargo;
	
	
	public Usuario(){	
		super();
	}
	
	public Usuario(int id, String nombreU, String cargo){

		this.idUsuario = id;
		this.nombreU = nombreU;
		this.cargo = cargo;
	}

	/**
	 * @return the idUsuario
	 */
	public int getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the nombreU
	 */
	public String getNombreU() {
		return nombreU;
	}

	/**
	 * @param nombreU the nombreU to set
	 */
	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public boolean seleccionarU(String usuario, String contracenia){
		
		boolean resul = false;
		Conexion_Singleton con = Conexion_Singleton.getConexion();
		String consulta= "SELECT * FROM  `usuario` WHERE nombreU = 'usuario' AND contraceniaU = 'usuario'";
		
		con.setConsulta(consulta);
		try {
			if(con.getListaResultado().last()) { 
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resul;
	}

}
