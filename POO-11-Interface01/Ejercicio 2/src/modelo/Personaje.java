package modelo;

public class Personaje implements Movible{
	private String nombre;
	private int vitalidad;
	private Posicion posicion= new Posicion();
	public Personaje(String nombre, int vitalidad, int posX,int posY) {
		this.setXY(posX, posY);
		this.nombre = nombre;
		this.vitalidad = vitalidad;
	}
	@Override
	public int getPosx() {		
		return posicion.getPosx();
	}

	@Override
	public int getPosy() {
		return posicion.getPosy();
	}

	@Override
	public void setXY(int x, int y) {
		posicion.setXY(x, y);
	}

	@Override
	public void incrementaPos(int valorX, int valorY) {
		posicion.incrementaPos(valorX, valorY);		
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + ", vitalidad=" + vitalidad + ", posicion=" + posicion;
	}

}
