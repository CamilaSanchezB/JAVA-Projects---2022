package modelo;

public abstract class NaveEspacial {
	protected String nombre;
	protected int energia;
	protected double posicionX;
	protected double posicionY;
	public NaveEspacial(double posicionX, double posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEnergia() {
		return energia;
	}
	public double getPosicionX() {
		return posicionX;
	}
	public double getPosicionY() {
		return posicionY;
	}
	public void Mueve(double x, double y) {
		this.posicionX+=x;
		this.posicionY+=y;
	}
	public abstract void ataca (NaveEspacial adversario);
	@Override
	public String toString() {
		return "nombre=" + nombre + ", energia=" + energia + ", posicionX=" + posicionX + ", posicionY="
				+ posicionY;
	}
	
}
