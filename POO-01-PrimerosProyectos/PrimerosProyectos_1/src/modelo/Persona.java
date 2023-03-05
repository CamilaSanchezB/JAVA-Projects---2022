package modelo;

public class Persona {
private String nombre;
private int edad;
private String email;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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
