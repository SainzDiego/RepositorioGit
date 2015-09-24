package Modelo;

public class Persona {
	
	private int idPersona;
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String correo;
	
	public Persona(){
	}

	public Persona(int idPersona, String nombre, String apellidoP, String apellidoM, String correo) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.correo = correo;
	}

	/**
	 * @return the idPersona
	 */
	public int getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidoP
	 */
	public String getApellidoP() {
		return apellidoP;
	}

	/**
	 * @param apellidoP the apellidoP to set
	 */
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	/**
	 * @return the apellidoM
	 */
	public String getApellidoM() {
		return apellidoM;
	}

	/**
	 * @param apellidoM the apellidoM to set
	 */
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
