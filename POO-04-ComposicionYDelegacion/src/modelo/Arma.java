package modelo;

public class Arma {
private String nombre;
private double nivelDanio;
private double nivelDanioInicial;
private double porcentajeRotura;
public String getNombre() {
	return nombre;
}

public Arma(String nombre, double nivelDanioInicial) {
	this.nombre = nombre;
	this.nivelDanioInicial = nivelDanioInicial;
	this.nivelDanio = this.nivelDanioInicial;
}
public double getNivelDanio() {
	return nivelDanio;
}
public double getNivelDanioInicial() {
	return nivelDanioInicial;
}
public double getPorcentajeRotura() {
	return porcentajeRotura;
}

public void desgastar(double rotura) {
		nivelDanio-=(rotura*nivelDanioInicial)/100;
		this.porcentajeRotura += rotura;
}

public boolean estaRota() {
	return porcentajeRotura>=100;
}
@Override
public String toString() {
	return "Arma [nombre=" + nombre + ", nivelDanio=" + nivelDanio + ", porcentajeRotura=" + porcentajeRotura + "]";
}

}
