package modelo;

public class VehiculoDeCarga extends Vehiculo{
	private double pma;
	public VehiculoDeCarga(String patente, double diasAlquilados, double pma) {
		super(patente, diasAlquilados);
		this.pma = pma;
		this.precioAlquilerDia+=this.precioAlquilerDia*(20*this.pma/100);
	}
	
	public void setPma(double pma) {
		this.pma = pma;
	}

	public double getPma() {
		return pma;
	}

	@Override
	public String toString() {
		return "Vehiculo de carga [ "+super.toString()+", pma=" + pma + "]";
	}
}
