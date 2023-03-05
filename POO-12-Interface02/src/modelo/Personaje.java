package modelo;

public abstract class Personaje extends Unidad implements IMovible, IPosicionable{
	protected Posicion posicion = new Posicion();
	public Personaje(String equipo, int costo, int energia, int x, int y) {
		super(equipo, costo, energia);
		this.posicion.setXY(x, y);
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
	public void mover(int x, int y) {
		this.posicion.setXY(this.posicion.getX() + x, this.posicion.getY() + y);
	}

	@Override
	public abstract void recibeDano(int cantidad);

	@Override
	public String toString() {
		return super.toString()+", posicion=" + posicion + "]";
	}	
	
}
