package prueba;

import modelo.Equipo;
import modelo.Jugador;

public class PruebaEquipo {
	public static void main(String[] args) {
		Equipo e1=new Equipo("Club Atletico River Plate", 1901);
		System.out.println(e1);
		Jugador j1=new Jugador("Franco Armani");
		j1.setPosicion("Arquero");
		j1.setEdad(35);
		j1.setEfectividad(63.3);
		Jugador j2=new Jugador("Enrique Bologna");
		j2.setPosicion("Arquero");
		j2.setEdad(40);
		j2.setEfectividad(37);
		Jugador j3=new Jugador("Ezequiel Centurion");
		j3.setPosicion("Arquero");
		j3.setEdad(24);
		j3.setEfectividad(35);
		e1.AgregarJugador(j1);
		e1.AgregarJugador(j2);
		System.out.println(e1);
		e1.EliminarJugador(j2);
		e1.AgregarJugador(j3);
		Jugador j4=new Jugador("Gonzalo Montiel");
		j4.setEdad(16);
		j4.setEfectividad(40);
		j4.setPosicion("Lateral");
		e1.AgregarJugador(j4);
		System.out.println(e1);
		System.out.println("Cantidad de jugadores: " + e1.getCantidadDeJugadores());
		System.out.println("Promedio de edad general:"+e1.promedioEdad());
		
		if (e1.promedioEdadMay()!=-1) {
			System.out.println("Promedio de edad mayores: "+e1.promedioEdadMay());
		}else System.out.println("No hay mayores");
		if (e1.promedioEdadMen()!= -1) {
			System.out.println("Promedio de edad menores: "+e1.promedioEdadMen());
		}else System.out.println("No hay menores");
		
		
	}
	
}
