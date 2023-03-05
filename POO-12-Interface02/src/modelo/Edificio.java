package modelo;

public abstract class Edificio extends Unidad implements IConstruible, IPosicionable{
	protected Construccion construccion = new Construccion();
	protected Posicion posicion = new Posicion();
	public Edificio(String equipo, int costo, int energia, int x, int y) {
		super(equipo, costo, energia);
		this.posicion.setXY(x, y);
	}
	
	@Override
	public int getTiempoConstruccion() {
		return this.construccion.getTiempoConstruccion();
	}

	@Override
	public void setTiempoConstruccion(int tiempoConstruccion) {
		this.construccion.setTiempoConstruccion(tiempoConstruccion);
	}

	@Override
	public int getX() {
		return this.posicion.getX();
	}

	@Override
	public int getY() {
		return this.posicion.getY();
	}

	@Override
	public void setXY(int x, int y) {
		this.posicion.setXY(x, y);
	}

	@Override
	public abstract void recibeDano(int cantidad);

	@Override
	public String toString() {
		return super.toString()+", construccion=" + construccion + ", posicion=" + posicion;
	}
	
	

}
