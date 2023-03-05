package modelo;

public class Defensor extends Jugador {

	public Defensor(String nombre, double velocidad, double potencia) {
		super(nombre, velocidad, potencia);
	}

	@Override
	public double indiceDefensa() {
		return Math.pow(this.velocidad, 2);
	}

	@Override
	public double indiceAtaque() {
		return Math.pow(this.potencia, 2);
	}

	@Override
	public String toString() {
		return "Defensor ["+super.toString()+"]";
	}

}