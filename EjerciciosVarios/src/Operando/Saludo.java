package Operando;

import javax.swing.JOptionPane;

public class Saludo {

	public static void main(String[] args) {

		String nombre = "Mapy";
		String pass="";
		
		//System.out.println("Bienvenido " + nombre);
		
		pass=JOptionPane.showInputDialog("Introduzca la conrase�a, por favor");
		
		while(nombre.equals(pass) == false) {
			
			if(nombre.equals(pass)==false) {
			
			System.out.println("Contrase�a incorrecta");
			
		}
	}
	
	System.out.println("Contrase�a correcta. Acceso permitido");
	
	}		
	
		
}


