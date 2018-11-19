package Operando;

public class Numeros {

	public static void main(String[] args) {

                 // declaracion de variables
		
		int num1=12;  // int num1 > num2
		int num2=8;
		                 // realizamos las operaciones
		
		System.out.println("El resultado de la suma es: " + (num1+num2));
		System.out.println("El resultado de la resta es: " + (num1-num2));
		System.out.println("El resultado de la multiplicación es: " + (num1*num2));
		System.out.println("El resultado de la división es: " + (num1/num2));
		
		if(num1 == num2) {
		
			System.out.println("El resultado es positivo");

	    }
		else if(num1 > num2) {
			
			System.out.println("El resultado es corrrecto");
		}
		else {
			System.out.println("El resultado es incorrecto");
		}
		
	}

}
