package modelo;

public abstract class Animal implements Emisor_de_Sonido{
	protected String nombre;
	protected int edad;
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
}
