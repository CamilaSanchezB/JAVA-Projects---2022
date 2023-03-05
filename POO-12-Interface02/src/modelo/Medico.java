package modelo;

public class Medico extends Personaje{

	public Medico(int x, int y) {
		super("Medico", 40, 100, x, y);
	}

	@Override
	public void recibeDano(int cantidad) {
		this.energia -= cantidad*1.5;
		
	}

	@Override
	public String toString() {
		return "Medico ["+super.toString()+"]";
	}
	
	

}
