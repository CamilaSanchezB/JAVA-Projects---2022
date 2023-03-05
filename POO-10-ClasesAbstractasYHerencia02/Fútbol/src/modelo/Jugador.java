package modelo;

public abstract class Jugador {
	public String nombre;
	public double velocidad;
	public double potencia;
	
	public Jugador(String nombre, double velocidad, double potencia) {
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.potencia = potencia;
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getPotencia() {
		return potencia;
	}
	
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public abstract double indiceDefensa();
	public abstract double indiceAtaque();

	@Override
	public String toString() {
		return "nombre=" + nombre + ", velocidad=" + velocidad + ", potencia=" + potencia + ", indiceDefensa="
				+ indiceDefensa() + ", indiceAtaque=" + indiceAtaque();
	}
	
}