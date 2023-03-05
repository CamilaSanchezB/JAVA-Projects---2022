package modelo;

public abstract class Unidad {
	protected String equipo;
	protected int costo;
	protected int energia;
	
	public Unidad(String equipo, int costo, int energia) {
		this.equipo = equipo;
		this.costo = costo;
		this.energia = energia;
	}
	
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public String getEquipo() {
		return equipo;
	}

	public int getCosto() {
		return costo;
	}

	public int getEnergia() {
		return energia;
	}

	public abstract void recibeDano(int cantidad);

	@Override
	public String toString() {
		return "equipo=" + equipo + ", costo=" + costo + ", energia=" + energia;
	}
	
	
}
