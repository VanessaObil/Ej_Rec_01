package unico;

public class Ej_01 {

	public static void main(String[] args) {
		/* Implementar un método que calcule a elevado a n, donde a es real, y n es un entero positivo. 
		 Realizar una versión iterativa y otra recursiva.*/

		int numero;
		int exponente;
		exponente=Util.leerInt("introduzca un numero");
		numero= Util.leerInt("Introduzca un numero");
		recElevado(numero, exponente);
		iteElevado(numero, exponente);
	
	}
public static double recElevado(double numero, int exponente) {
	double respuesta;
	if(exponente==1){
		respuesta = numero ;
	}else {
		respuesta = numero * recElevado(numero, exponente -1);
	}	
	return respuesta;
}
public static double iteElevado(int numero, int exponente) {
	int respuesta = numero;
	for(int i=1; i<exponente; i++) {
		respuesta = numero * respuesta;
	}
	return respuesta;
}
}
