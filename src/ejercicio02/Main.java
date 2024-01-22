package ejercicio02;

import java.util.Scanner;

public class Main {

	//Scanner para leer del teclado
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		//Variable para guardar las cartas que elige el usuario
		int carta1, carta2;
		
		//Boolean para saber si el jugador ha ganado
		boolean ganar = false;
		
		//Creo objeto para las funciones
		Cartas partida;
		
		//Genero el tablero
		Cartas.generaTableros();
		
		//Bucle para que el juego continue hasta que se revelan todas las cartas
		while (!ganar) {
			//Muestro las cartas boca abajo
			Cartas.imprimeTablero();
			
			//Pregunto al usuario que elija la primera carta
			carta1 = preguntaCarta();
			
			//Muestro la carta elegida boca arriba
			Cartas.cartaArriba(carta1);
			Cartas.imprimeTablero();
			
			//Pregunto al usuario que elija la segunda carta
			carta2 = preguntaCarta();
			
			//Muestro la segunda carta elegida
			Cartas.cartaArriba(carta2);
			Cartas.imprimeTablero();
			
			//Compruebo si son pareja
			partida = new Cartas (carta1, carta2);
			partida.parejas();
			
			//Compruebo si he ganado
			ganar = partida.ganar();
			
			//Lineas vacias para poder leer mejor
			System.out.println();
		}
		
		//Cierro el Scanner
		sc.close();
	}//Fin del Main
	
	public static int preguntaCarta () {
		int carta;
		
		System.out.println("Elija una carta");
		carta = sc.nextInt();
		
		return carta;
	}

}
