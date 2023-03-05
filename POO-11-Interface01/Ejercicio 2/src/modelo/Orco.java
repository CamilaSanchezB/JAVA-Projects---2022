package modelo;

public class Orco extends Personaje{

	public Orco(String nombre, int vitalidad, int posX, int posY) {
		super(nombre, vitalidad, posX, posY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Orco ["+super.toString()+"]";
	}

}
