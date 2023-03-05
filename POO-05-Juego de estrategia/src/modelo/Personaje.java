package modelo;

public class Personaje {
protected String nombre;
protected int vitalidad;
protected int alcanceDeAtaque;
protected int danioDeAtaque;
protected Posicion posicion;

public Personaje(String nombre, Posicion posicion) {
	super();
	this.nombre = nombre;
	this.posicion = posicion;
}

public String getNombre() {
	return nombre;
}

public int getVitalidad() {
	return vitalidad;
}

public void setVitalidad(int vitalidad) {
	this.vitalidad = vitalidad;
}

public int getAlcanceDeAtaque() {
	return alcanceDeAtaque;
}

public void setAlcanceDeAtaque(int alcanceDeAtaque) {
	this.alcanceDeAtaque = alcanceDeAtaque;
}

public int getDanioDeAtaque() {
	return danioDeAtaque;
}

public void setDanioDeAtaque(int danioDeAtaque) {
	this.danioDeAtaque = danioDeAtaque;
}

public double getPosX() {
	return posicion.getPosX();
}

public double getPosY() {
	return posicion.getPosY();
}
public void setPosXY(double posX, double posY) {
	posicion.setXY(posX, posY);
}
public Posicion getPosicion() {
	return posicion;
}

public boolean atacar(Personaje adversario) {
	boolean respuesta=false;
	if(posicion.distancia(adversario.posicion)<=alcanceDeAtaque) {
		respuesta = true;
		adversario.recibeDanio(danioDeAtaque);
	}
	return respuesta;
}

public void mover(double valorX, double valorY) {
	posicion.incrementaPos(valorX, valorY);
}

public double distanciaA(Personaje objetivo) {
	return posicion.distancia(objetivo.posicion);
}

protected void recibeDanio(int cantidad) {
	vitalidad-=cantidad;
}

@Override
public String toString() {
	return "nombre=" + nombre + ", vitalidad=" + vitalidad + ", alcanceDeAtaque=" + alcanceDeAtaque
			+ ", danioDeAtaque=" + danioDeAtaque + ", posicion= [" + posicion + "]" ;
}



}