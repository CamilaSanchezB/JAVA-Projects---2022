package modelo;

public class Armadura {
private String nombre;
private double nivelDeDefensa;

public Armadura() {}
public Armadura(String nombre, double nivelDeDefensa) {
	this.nombre=nombre;
	this.nivelDeDefensa=nivelDeDefensa;
}
public String getNombre() {
	return nombre;
}
public double getNivelDeDefensa() {
	return nivelDeDefensa;
}
public void recibeDanio(double danio) {
	nivelDeDefensa-=danio;
}
@Override
public String toString() {
	return "Armadura [nombre=" + nombre + ", nivelDeDefensa=" + nivelDeDefensa + "]";
}

}
