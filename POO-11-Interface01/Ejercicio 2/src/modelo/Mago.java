package modelo;

public class Mago extends Personaje{

	public Mago(String nombre, int vitalidad, int posX, int posY) {
		super(nombre, vitalidad, posX, posY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mago ["+super.toString()+"]";
	}

}
