package modelo;

public class Guerrero {
private String nombre;
private double vitalidad;
private double nivelDanio;
private Armadura armadura;
private Posicion posicion;
private Arma arma;
public Guerrero(String nombre, double vitalidad,double nivelDanio){
	this.nombre=nombre;
	this.vitalidad=vitalidad;
	this.nivelDanio=nivelDanio;
} 	 

public String getNombre() {
	return nombre;
}
public double getVitalidad() {
	return vitalidad;
}
public double getNivelDefensa() {
	if (armadura != null) {
		return armadura.getNivelDeDefensa();
	}else return 0;
}
public double getNivelDanio() {
	if (arma != null) {
		return arma.getNivelDanio();
	}else return nivelDanio;
}
public double getX() {
	return posicion.getX();
}
public double getY() {
	return posicion.getY();
}
public void mueve(double incrementoX, double incrementoY) {
	posicion.mover(incrementoX, incrementoY);
}
public void setPosicion(Posicion posicion) {
	this.posicion = posicion;
}
public void setArmadura(Armadura armadura) {
	this.armadura = armadura;
}

public void setArma(Arma arma) {
	this.arma = arma;
}
public Arma getArma() {
	return arma;
}
public Armadura getArmadura() {
	return armadura;
}

public void recibeDanio(double cantidad) {
	if (armadura == null) {
		vitalidad -= cantidad;
	}else {
		armadura.recibeDanio(cantidad);
		if(armadura.getNivelDeDefensa()<=0) {
			vitalidad+= armadura.getNivelDeDefensa();
			armadura = null;
		}
	}
}
public void atacar(Guerrero objetivo) {
	System.out.println(nombre+" ataca a "+objetivo.nombre+" con "+this.getNivelDanio()+" puntos de ataque");
	objetivo.recibeDanio(this.getNivelDanio());
	if (arma!= null) {
		arma.desgastar(10);
		if(arma.estaRota()) {
			arma=null;
			System.out.println("Se rompio el arma de "+nombre);
		}
	}
}

@Override
public String toString() {
	return "Guerrero [nombre=" + nombre + ", vitalidad=" + vitalidad + ", nivelDanio=" + nivelDanio + ", armadura="
			+ armadura + ", posicion=" + posicion + ", arma=" + arma + "]";
}

}

