package modelo;

public class Persona {
private String nombre;
private int edad;
private String email;

/*
La clase Persona no debe permitir que se cambie su nombre,
para ello escribe los constructores que nos permitan inicializar el nombre.
 public Persona(String nombre) {
	this.nombre=nombre;
}
Escribe también un constructor con un parámetro String para 
el nombre y un parámetro entero para la edad.
 public Persona(String nombre, int edad) {
	this.nombre=nombre;
	this.edad=edad;
}*/
//Escribe también un constructor con un parámetro String para el nombre, 
//un parámetro entero para la edad, y un parámetro String para el Email.
public Persona(String nombre, int edad, String email) {
	this.nombre=nombre;
	this.edad=edad;
	this.email=email;
}
public String getNombre() {
	return nombre;
}
public int getEdad() {
	return edad;
}
public String getEmail() {
	return email;
}
public boolean SosMayor() {
	return this.edad>=18;
}
public int repeticionesDeLetra(char letra) {
	int c=0;
	for (int i=0; i<this.nombre.length(); i++) {
		if (this.nombre.charAt(i) == letra) {
			c++;
		}
	}
	return c;
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
}

}
