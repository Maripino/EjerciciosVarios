package Operando;

import javax.swing.JOptionPane;

public class Saludo {

	public static void main(String[] args) {

		String nombre = "Mapy";
		String pass="";
		
		//System.out.println("Bienvenido " + nombre);
		
		pass=JOptionPane.showInputDialog("Introduzca la conraseņa, por favor");
		
		while(nombre.equals(pass) == false) {
			
			if(nombre.equals(pass)==false) {
			
			System.out.println("Contraseņa incorrecta");
			
		}
	}
	
	System.out.println("Contraseņa correcta. Acceso permitido");
	
	}		
	
		
}


