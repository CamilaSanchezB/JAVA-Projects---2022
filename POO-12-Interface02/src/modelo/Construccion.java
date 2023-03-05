package modelo;

public class Construccion implements IConstruible{
	private int tiempoConstruccion;
	@Override
	public int getTiempoConstruccion() {
		// TODO Auto-generated method stub
		return this.tiempoConstruccion;
	}

	@Override
	public void setTiempoConstruccion(int tiempoConstruccion) {
		// TODO Auto-generated method stub
		this.tiempoConstruccion = tiempoConstruccion;
	}

	@Override
	public String toString() {
		return "[tiempoConstruccion=" + tiempoConstruccion + "]";
	}

}
