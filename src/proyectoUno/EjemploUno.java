package proyectoUno;

public class EjemploUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tipo de datos primitivos (short, int, long, char, float)
		short afp1; // soporta valores entre -32,768 y 32,767, 16-bit
		int edad; // esta variable no esta inicializada, soporta valores entre -2**31 y 2**31, 32-bit
		long afp2;//soporta valores entre -2**63 y 2**63-1, 64*bit
		String nombre; //cadenas de texto, esta variable no esta inicializada, STRING es de clase u objeto y se declara con comillas dobles
		char letra; // el dato tipo char se declara con comillas simples '' y solo puede contener una letra
		float nota;
		
		
		
		
		edad = 20; //se inicializa la variable edad
		nombre = "Alfredo"; //se inicializa la variable nombre
		nota = 6.5f; //se inicializa la variable nota, pero como es float se debe
		afp1 = 32767;// soporta hasta este valor, para más valores es mejor usar un int o long
		afp2 = 333333333;
		letra = 'a';
		
		
		
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(nota);
		System.out.println(afp1);
		System.out.println(afp2);
		System.out.println(letra);
		System.out.println("");
		System.out.println("Tipos de datos como Clase");
		
		//Tipos de datos como Clase, siempre comienzan en mayuscula. Estas clases vienen con metodos y atraibutos asociados como el ParseInt
		
		Integer numero = 0;
		Double medidaParticula = 0.0;
		Long saldo = 6500000000L; //se añade una L
		
		
		
		System.out.println(numero);
		System.out.println(medidaParticula);
		System.out.println(saldo);
		System.out.println("");
		System.out.println("Operadores Aritmeticos");
		
		//Operadores aritmeticos => + - * / (resto), los pares siempre seran 0
		
		//+ suma
		//- resta
		//* multiplicacion
		// / division
		// resto devuelve el sobrante de una division
		// ++ suma + 1 a una variable
		// -- resta - 1 a una variable
		
		Integer numeroEjemplo = 0;
		numeroEjemplo++;// el ++ a la derecha tiene menos prioridad
		++numeroEjemplo;// el ++ a la izquierda tiene mas prioridad
		System.out.println(numeroEjemplo++);// en este ejemplo solo pintará 2 y después aumentará a 3
		System.out.println(numeroEjemplo);// Pintará 3
		System.out.println(++numeroEjemplo);//ahora esta a la izquierda y se ejecutara primero y pintara 4, por la prioridad
		System.out.println("");
		System.out.println("Operadores Relacional");
	
		
		
		//Operadores Relacional: <, =, >, =<, =>
		
		System.out.println("");
		System.out.println("Operadores Logicos");
		// Operadores Logicos: &, && (and y), |, || (or o), ! (negacion)
		

	}

}
