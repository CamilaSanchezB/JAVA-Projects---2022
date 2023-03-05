package modelo;

public class Guerrero {
private String nombre;
private double vitalidad=500;
private double armadura=800;
private double x;
private double y;

/*
Escribe un constructor con un parámetro de tipo String para inicializar el nombre, el cual no deberá
poder modificarse luego.
public Guerrero(String nombre){
	this.nombre=nombre;
}
*/
public Guerrero(String nombre, double x, double y){
	this.nombre=nombre;
	this.x=x;
	this.y=y;
} 	 

public String getNombre() {
	return nombre;
}
public double getVitalidad() {
	return vitalidad;
}
public double getArmadura() {
	return armadura;
}

public double getX() {
	return x;
}
public double getY() {
	return y;
}
public void mover(double inc_x, double inc_y) {
	x+=inc_x;
	y+=inc_y;
}

public void recibeDano(double cantidad) {
	if (armadura-cantidad >= 0) {
		armadura-=cantidad;
	}
	else {
		vitalidad-= cantidad-armadura;
		armadura=0;
	}
	
}
@Override
public String toString() {
	return "Guerrero [nombre=" + nombre + ", vitalidad=" + vitalidad + ", armadura=" + armadura + ", x=" + x + ", y="
			+ y + "]";
}
}
