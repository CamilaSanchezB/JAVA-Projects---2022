package modelo;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private int anioCreacion;
	private ArrayList<Jugador> jugadores =new ArrayList<Jugador>();
	public Equipo(String nombre, int anioCreacion) {
		this.nombre=nombre;
		this.anioCreacion=anioCreacion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getAnioCreacion() {
		return anioCreacion;
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
	public double promedioEdad() {
		double suma=0;
		for(Jugador jugador : jugadores) {
		    suma += jugador.getEdad();
		}
		return suma/jugadores.size();
	}
	public double promedioEdadMay() {
		double suma=0;
		double cant=0;
		for(Jugador jugador : jugadores) {
		    if (jugador.getEdad()>=18) {
		    	suma+=jugador.getEdad();
		    	cant++;
		    }
		}
		if (cant!=0) {
			return suma/cant;
		}else return -1;
	}
	public double promedioEdadMen() {
		double suma=0;
		double cant=0;
		for(Jugador jugador : jugadores) {
		    if (jugador.getEdad()<18) {
		    	suma+=jugador.getEdad();
		    	cant++;
		    }
		}
		if (cant!=0) {
			return suma/cant;
		}else return -1;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", anioCreacion=" + anioCreacion + ", jugadores=" + jugadores + "]";
	}
	
}
