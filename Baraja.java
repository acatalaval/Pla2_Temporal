package JuegoDeCartas;

import java.util.ArrayList;

public abstract class Baraja {   //una clase de la que no se tiene intención de crear objetos, sino que únicamente sirve para unificar datos u operaciones de subclases, puede declararse de forma especial en Java: como clase abstracta.

	//atributos
	protected ArrayList<Carta> cartas;
	protected int numCartas;
	protected int cartasxPalo;
    protected int nextPosic;
	
	public Baraja() {
		cartas=new ArrayList<Carta>();
		this.nextPosic = 0;
	}
	
	//metodos
	void barajar() {
	 //Desordena el ArrayList de cartas (Pista: Collections.shuffle(list);
	
	}
	
	public void mostrarBaraja() {
		for (int i=0; i<numCartas;i++) {
			System.out.println(cartas.get(i));
		}
	}
	
	Carta repartir() {
		Carta c=null;
	 //Obtiene la primera carta del ArrayListy, la quita de la lista de cartas, y nos devuelve el objeto.
	return c;
	}
	
	public abstract void reiniciar(); //Método abstracto que debe sosbreescribirse en las clases derivadas para crear baraja
}
