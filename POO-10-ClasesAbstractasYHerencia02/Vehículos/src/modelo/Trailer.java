package modelo;

public class Trailer {
	protected double precioAlquilerDia;

	public Trailer(double precioAlquilerDia) {
		this.precioAlquilerDia = precioAlquilerDia;
	}

	public double getPrecioAlquilerDia() {
		return precioAlquilerDia;
	}

	@Override
	public String toString() {
		return "Trailer [precioAlquilerDia=" + precioAlquilerDia + "]";
	}
	
}
