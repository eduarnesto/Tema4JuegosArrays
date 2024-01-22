package ejercicio02;

import java.util.Arrays;
import java.util.Random;

public class Cartas {
	int posCarta1;
	int posCarta2;
	int parejasReveladas = 0;
	final static int TAMTABLERO = 6;
	static String tablero[] = new String[TAMTABLERO];
	static int tableroNumeros[] = new int[TAMTABLERO];
	static Random rand = new Random();

	public Cartas(int posCarta1, int posCarta2) {
		super();
		this.posCarta1 = posCarta1;
		this.posCarta2 = posCarta2;
	}

	public Cartas() {
		super();
	}

	public static void generaTableros() {
		int posAleatoria;
		int contador = 1;
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = "[] ";
		}

		while (contador <= tablero.length / 2) {
			posAleatoria = rand.nextInt(0, tablero.length);
			for (int i = 1; i <= 2; i++) {
				while (tableroNumeros[posAleatoria] != 0) {
					posAleatoria = rand.nextInt(0, tablero.length);
				}
				tableroNumeros[posAleatoria] = contador;
				System.out.println(contador);
			}
			contador++;
		}
	}

	public static void imprimeTablero() {
		System.out.println(Arrays.toString(tablero));
		System.out.println();
	}

	public static void cartaArriba(int carta) {
		tablero[carta] = Integer.toString(tableroNumeros[carta]);
	}

	public void parejas() {
		if (tableroNumeros[posCarta1] != tableroNumeros[posCarta2]) {
			tablero[posCarta1] = "[] ";
			tablero[posCarta2] = "[] ";
		} else {
			parejasReveladas++;
		}
	}

	public boolean ganar() {
		boolean ganado = false;

		if (parejasReveladas == tablero.length) {
			ganado = true;
		}

		return ganado;
	}
}
