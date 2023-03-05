package prueba;

import java.util.Random;

import modelo.*;

public class TestPersonaje {

	public static void main(String[] args) {
		Random rand = new Random();
		Personaje c = new Caballero("Nahuel", 1500, 1,1);
		Personaje e = new Elfo("Julian", 950, 1, 3);
		Personaje o = new Orco("Eduardo", 2000, 4,6);
		Personaje m = new Mago("Camila", 700, 3,9);
		Personaje[] personajes = new Personaje[] {c,e,o,m};
		for (Personaje personaje : personajes) {
			personaje.dibujar();
		}
		System.out.println("");

		for (Personaje personaje : personajes) {
			System.out.println(personaje);
		}
		System.out.println("");
		for (Personaje personaje : personajes) {
			personaje.incrementaPos(rand.nextInt(11), rand.nextInt(6));
			System.out.println(personaje);
		}
	}

}
