package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Equipo {
	private String nombre;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

	public Equipo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void AgregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}

	public void EliminarJugador(Jugador jugador) {
		jugadores.remove(jugador);
	}

	public int getCantidadDeJugadores() {
		return jugadores.size();
	}

	public double indiceDefensa() {
		Iterator<Jugador> it = jugadores.iterator();
	    double suma = 0;
	    while(it.hasNext()) {
	      suma += it.next().indiceDefensa();
	    }
		return suma;
	}
	
	public double indiceAtaque() {
		Iterator<Jugador> it = jugadores.iterator();
	    double suma = 0;
	    while(it.hasNext()) {
	      suma += it.next().indiceAtaque();
	    }
		return suma;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + ", indice de ataque de equipo="+ this.indiceAtaque()+", indice de defensa de equipo ="+ this.indiceDefensa() +"]";
	}
	

}