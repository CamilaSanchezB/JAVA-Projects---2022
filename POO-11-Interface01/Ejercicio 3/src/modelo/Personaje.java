package modelo;

public class Personaje implements Movible, Dibujable{
	private String nombre;
	private int vitalidad;
	private Posicion posicion= new Posicion();
	private RepresentacionEnConsola representacionEnConsola = new RepresentacionEnConsola(this);
	public Personaje(String nombre, int vitalidad, int posX,int posY) {
		this.setXY(posX, posY);
		this.nombre = nombre;
		this.vitalidad = vitalidad;
	}
	
	public int getVitalidad() {
		return vitalidad;
	}

	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}

	public String getNombre() {
		return nombre;
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
	public void dibujar() {
		representacionEnConsola.dibujar();	
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", vitalidad=" + vitalidad + ", posicion=" + posicion;
	}

}
