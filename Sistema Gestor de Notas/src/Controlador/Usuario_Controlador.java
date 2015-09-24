package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Usuario;
import Vista.Acceso_al_Sistema;

public class Usuario_Controlador {
	
private Usuario usuarios;
	
	public Usuario_Controlador(){
		
	}
    public boolean verificar (String usuario,String contraseña){
    	usuarios = new Usuario(usuario,contraseña);
    	return this.usuarios.seleccionarU(usuario, contraseña);
    }
}
