package Modelo;

public class Materia {
	
	private int idMateria;
	private String nombre;
	private int Semestre_idSemestre;
	private int Planilla_idPlanilla;
	
	public Materia(){
		
	}
	
	public Materia(int idMat, String nombre, int sem_idSem, int plant_Idplant){
		this.idMateria = idMat;
		this.nombre = nombre;
		this.Semestre_idSemestre = sem_idSem;
		this.Planilla_idPlanilla = plant_Idplant;
	}

	/**
	 * @return the idMateria
	 */
	public int getIdMateria() {
		return idMateria;
	}

	/**
	 * @param idMateria the idMateria to set
	 */
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
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
	 * @return the semestre_idSemestre
	 */
	public int getSemestre_idSemestre() {
		return Semestre_idSemestre;
	}

	/**
	 * @param semestre_idSemestre the semestre_idSemestre to set
	 */
	public void setSemestre_idSemestre(int semestre_idSemestre) {
		Semestre_idSemestre = semestre_idSemestre;
	}

	/**
	 * @return the planilla_idPlanilla
	 */
	public int getPlanilla_idPlanilla() {
		return Planilla_idPlanilla;
	}

	/**
	 * @param planilla_idPlanilla the planilla_idPlanilla to set
	 */
	public void setPlanilla_idPlanilla(int planilla_idPlanilla) {
		Planilla_idPlanilla = planilla_idPlanilla;
	}
}
