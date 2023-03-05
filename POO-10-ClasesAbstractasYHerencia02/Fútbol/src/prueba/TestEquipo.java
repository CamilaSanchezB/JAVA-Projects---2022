package prueba;

import modelo.Equipo;
import modelo.Jugador;
import modelo.Arquero;
import modelo.Defensor;
import modelo.Delantero;

public class TestEquipo {
	public static void main(String[] args) {
		Jugador j1 = new Delantero("Julian Álvarez", 0.86, 0.9);
		Jugador j2 = new Defensor("Gonzalo Montiel", 0.86, 0.8);
		Jugador j3 = new Arquero("Franco Armani", 0.7, 0.9,0.82);
		Equipo e1 = new Equipo("Selección Argentina");
		e1.AgregarJugador(j1);
		e1.AgregarJugador(j2);
		e1.AgregarJugador(j3);
		System.out.println(e1);

	}	
}