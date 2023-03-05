package modelo;

public class Jugador {
	public String nombre;
	public int edad;
	public String posicion;
	public double efectividad;
	public Jugador(String nombre) {
		this.nombre=nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public double getEfectividad() {
		return efectividad;
	}
	public void setEfectividad(double efectividad) {
		if(efectividad>=0 || efectividad <=10) {
			this.efectividad = efectividad;
		}
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + ", efectividad="
				+ efectividad + "]";
	}
	
}
