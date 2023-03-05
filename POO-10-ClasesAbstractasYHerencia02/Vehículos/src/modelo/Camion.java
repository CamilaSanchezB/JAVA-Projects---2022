package modelo;

public class Camion extends Vehiculo {
	private Trailer trailer;

	public Camion(String patente, double diasAlquilados) {
		super(patente, diasAlquilados);
		this.precioAlquilerDia+= this.precioAlquilerDia * 0.4;
	}

	public Trailer getTrailer() {
		return trailer;
	}

	public void setTrailer(Trailer trailer) {
		this.trailer = trailer;
	}

		
	@Override
	public double precioTotal() {
		double precio;
		if(this.trailer != null) {
			precio = (this.precioAlquilerDia + this.trailer.precioAlquilerDia) * this.diasAlquilados;
		}else {
			precio = super.precioTotal();
		}
		return precio;
	}
	public String toString() {
		return "Camion [ "+super.toString()+", trailer=" + trailer + "]";
	}
}
