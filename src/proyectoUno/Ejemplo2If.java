package proyectoUno;

import java.util.Scanner;

public class Ejemplo2If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = 15;
		Scanner teclado = new Scanner(System.in);//el Scanner es una clase
		System.out.println("ingrese su edad");
		edad = teclado.nextInt();
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("No se permiten menores");
		}
		
		System.out.println("Tiene pase de movilidad: 1.- Si 2.- No");
		int opcion = teclado.nextInt();
		if(opcion == 1) {
			System.out.println("Puede entrar al concierto");
		} else {
			System.out.println("Noo puede entrar al concierto");
		}
		
	
	}
}
