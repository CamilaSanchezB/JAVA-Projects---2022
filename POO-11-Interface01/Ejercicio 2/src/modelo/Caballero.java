package modelo;

public class Caballero extends Personaje{

	public Caballero(String nombre, int vitalidad, int posX, int posY) {
		super(nombre, vitalidad, posX, posY);
	}

	@Override
	public String toString() {
		return "Caballero ["+super.toString()+"]";
	}

}
