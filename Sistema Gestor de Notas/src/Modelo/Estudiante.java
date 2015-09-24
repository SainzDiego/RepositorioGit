package Modelo;

public class Estudiante extends Persona{
	
	private int Materia_materiaId;
	
	public Estudiante(){
		super();
	}
	
	public Estudiante(int idPersona, String nombre, String apellidoP, String apellidoM, String correo, int materi_matId){
		super(idPersona, nombre, apellidoP,apellidoM, correo);
		this.Materia_materiaId = materi_matId;
	}

	/**
	 * @return the materia_materiaId
	 */
	public int getMateria_materiaId() {
		return Materia_materiaId;
	}

	/**
	 * @param materia_materiaId the materia_materiaId to set
	 */
	public void setMateria_materiaId(int materia_materiaId) {
		Materia_materiaId = materia_materiaId;
	}
}
