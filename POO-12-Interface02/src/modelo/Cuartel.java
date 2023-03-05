package modelo;

public class Cuartel extends Edificio{
	
	public Cuartel(int x, int y) {
		super("Cuartel", 500, 3000, x, y);
		this.construccion.setTiempoConstruccion(60);
	}

	@Override
	public void recibeDano(int cantidad) {
		this.energia-= cantidad*.5;	
	}

	@Override
	public String toString() {
		return "Cuartel ["+super.toString()+"]";
	}
	
}
