package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Variable para la posicion del golpe
		int posGolpe;
		
		//Boolean para saber si ha golpeado a la mosca
		boolean ganar = false;
		
		//Objeto para 
		CazaMosca mosca = new CazaMosca ();
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Genero el tablero
		CazaMosca.generaTablero();
		
		//Genero la posicion de la mosca
		mosca.vuela();
		
		//Repito el juego hasta que el jugador gane
		while(!ganar) {
			//Muestro el tablero
			CazaMosca.imprimeTablero();
			
			//Pregunto al jugador que casilla quiere golpear
			System.out.println("¿Qué casilla quieres golpear?");
			
			//Leo del teclado
			posGolpe = sc.nextInt();
			
			//Compruebo si la mosca estaba en la posicion del golpe
			ganar = mosca.golpeMosca(posGolpe);
			
			//Compruebo si la mosca estaba en una casilla adyacente
			mosca.casillaAdyacente(posGolpe);
			
		}
		
		//Muestro un mensaje de victoria
		System.out.println("Has matado a la mosca, felicidades");
		
		//Cierro el Scanner
		sc.close();
	}

}
