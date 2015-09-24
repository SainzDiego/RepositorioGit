package Modelo;

public class Usuario extends Persona{
	
	private int idUsuario;
	private String nombreU;
	private String cargo;
	
	
	public Usuario(){	
		super();
	}
	
	public Usuario(int idPersona, String nombre, String apellidoP, String apellidoM, String correo,int id, String nombreU, String cargo){
		super(idPersona, nombre, apellidoP, apellidoM, correo);
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
}
