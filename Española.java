package JuegoDeCartas;

import java.util.ArrayList;

public class Española extends Baraja {
	
	public static String[] palo = {"oros", "espadas", "copas", "bastos"};
	public static String[] nombre = {"1","2","3","4","5","6","7","sota","caballo","rey"};
	public static int[] valor = {1,2,3,4,5,6,7,10,11,12};
	ArrayList<Carta> cartas;
	
	public Española() {
		super();
		
		this.numCartas=40;
		this.cartasxPalo=10;
		
		reiniciar();
		super.barajar();
	}
	
	
	@Override
	public void reiniciar() {
		cartas = new ArrayList<Carta>();
		Carta c= null;
	
		// PalosBarajaEspañola[] palos = PalosBarajaEspañola.values();
		
		//Recorremos los palos
		for (int i=0; i<palo.length; i++) {
			// Recorremos los nombres
			for (int j=0; j<cartasxPalo; j++) {
				//c.toString = nombre[j]+" "+palos[i];
				c = new Carta (palo[i], nombre[j+1], valor[j+1]);
				cartas.add(((i*10)+j), c); 
			}
		}
		System.out.println(cartas);
	}

}
