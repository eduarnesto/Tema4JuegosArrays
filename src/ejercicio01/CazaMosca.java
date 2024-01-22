package ejercicio01;

import java.util.Arrays;
import java.util.Random;

public class CazaMosca {
	int posMosca;
	final static int TAMTABLERO = 7;
	static String tablero[] = new String [TAMTABLERO];
	Random r = new Random ();
	
	public CazaMosca(int posMosca) {
		super();
		this.posMosca = posMosca;
	}

	public CazaMosca() {
		super();
	}
	
	static void generaTablero () {
		for (int i=0; i<tablero.length; i++) {
			tablero [i]="[]";
		}
	}
	
	static void imprimeTablero () {
		System.out.println(Arrays.toString(tablero));
	}
	
	public void casillaAdyacente (int posGolpe) {
		if (posMosca == (posGolpe+1) || posMosca == (posGolpe+1)) {
			vuela();
		}
	}
	
	public void vuela () {
		posMosca = r.nextInt(0,TAMTABLERO);
	}
	
	public boolean golpeMosca(int posGolpe) {
		boolean golpeada = false;
		if (posMosca==posGolpe) {
			golpeada = true;
		}
		return golpeada;
	}
}
