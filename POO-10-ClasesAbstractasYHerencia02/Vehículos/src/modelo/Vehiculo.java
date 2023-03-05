package modelo;

public abstract class Vehiculo {
	protected String patente;
	protected double precioAlquilerDia = 500;
	protected double diasAlquilados;

	public Vehiculo(String patente, double diasAlquilados) {
		this.patente = patente;
		this.diasAlquilados = diasAlquilados;
	}

	public String getPatente() {
		return patente;
	}

	public void setPrecioAlquilerDia(double precioAlquilerDia) {
		this.precioAlquilerDia = precioAlquilerDia;
	}

	public double getPrecioAlquilerDia() {
		return precioAlquilerDia;
	}

	public double getDiasAlquilados() {
		return diasAlquilados;
	}

	public void setDiasAlquilados(double diasAlquilados) {
		this.diasAlquilados = diasAlquilados;
	}

	public  double precioTotal() {
		return this.precioAlquilerDia * this.diasAlquilados;
	}

	@Override
	public String toString() {
		return "patente=" + patente + ", precioAlquilerDia=" + precioAlquilerDia + ", diasAlquilados="
				+ diasAlquilados + ", precio total de alquiler= "+precioTotal();
	}
	
	
}
