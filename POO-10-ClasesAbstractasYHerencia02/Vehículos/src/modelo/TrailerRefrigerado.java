package modelo;

public class TrailerRefrigerado extends Trailer{
	protected double temperaturaMinima;

	public TrailerRefrigerado(double precioAlquilerDia, double temperaturaMinima) {
		super(precioAlquilerDia);
		this.temperaturaMinima = temperaturaMinima;
	}

	public double getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}

	@Override
	public String toString() {
		return "TrailerRefrigerado [temperaturaMinima=" + temperaturaMinima + ", precioAlquilerDia=" + precioAlquilerDia
				+ "]";
	}
	
}
