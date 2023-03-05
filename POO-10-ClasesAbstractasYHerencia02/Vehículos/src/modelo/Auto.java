package modelo;

public class Auto extends Vehiculo{
	private int plazas;
	public Auto(String patente, double diasAlquilados, int plazas) {
		super(patente, diasAlquilados);
		this.plazas = plazas;
		this.precioAlquilerDia += plazas*this.precioAlquilerDia*0.015;
	}
	
	public int getPlazas() {
		return plazas;
	}


	@Override
	public String toString() {
		return "Auto [ "+super.toString()+", plazas=" + plazas + "]";
	}
	
	
}
