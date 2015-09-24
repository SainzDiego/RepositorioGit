package Modelo;

public class Plantilla {
	private int idPlantilla;
	private String tipo;
	
	public Plantilla(){
		
	}
	
	public Plantilla(int idPlant, String tip){
		this.idPlantilla = idPlant;
		this.tipo = tip;
	}

	/**
	 * @return the idPlantilla
	 */
	public int getIdPlantilla() {
		return idPlantilla;
	}

	/**
	 * @param idPlantilla the idPlantilla to set
	 */
	public void setIdPlantilla(int idPlantilla) {
		this.idPlantilla = idPlantilla;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
