package modelo;

public class Combi extends Vehiculo{
	private int plazas;
	public Combi(String patente, double diasAlquilados, int plazas) {
		super(patente, diasAlquilados);
		this.plazas = plazas;
		this.precioAlquilerDia += plazas*this.precioAlquilerDia*0.02;
		}
	public int getPlazas() {
		return plazas;
	}

	@Override
	public String toString() {
		return "Combi [ "+super.toString()+", plazas=" + plazas + "]";
	}
}
