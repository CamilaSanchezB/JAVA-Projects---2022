package modelo;

public class Automovil {
	private String marca;
	private int modelo;
	private Motor motor;
	private Chasis chasis;
	private double precio;
	public Automovil(String marca, int modelo, Motor motor, Chasis chasis) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.chasis = chasis;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public int getModelo() {
		return modelo;
	}
	public Motor getMotor() {
		return motor;
	}
	public Chasis getChasis() {
		return chasis;
	}
	public String getTipoCOmbustible(){
		return motor.getTipoCombustible();
	}
	public double getCilindrada() {
		return motor.getCilindrada();
	}
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", chasis=" + chasis
				+ ", precio=" + precio + "]";
	}
	
}
