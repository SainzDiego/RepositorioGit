package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Usuario;
import Vista.Acceso_al_Sistema;

public class Usuario_Controlador {
	
private Usuario usuarios;
	
	public Usuario_Controlador(){
		
	}
    public boolean verificar (String usuario,String contrase�a){
    	usuarios = new Usuario(usuario,contrase�a);
    	return this.usuarios.seleccionarU(usuario, contrase�a);
    }
}
