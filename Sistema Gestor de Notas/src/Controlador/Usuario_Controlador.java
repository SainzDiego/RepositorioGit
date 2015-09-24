package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Usuario;
import Vista.Acceso_al_Sistema;

public class Usuario_Controlador {
	
private Usuario usuarios;
	
	public Usuario_Controlador(){
		
	}
    public boolean verificar (int id, String usuario,String contraseña){
    	usuarios = new Usuario(id, usuario,contraseña);
    	return this.usuarios.seleccionarU(usuario, contraseña);
    }
}
