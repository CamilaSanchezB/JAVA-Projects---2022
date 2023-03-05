package modelo;

public class Soldado extends Personaje implements IHostil{

	public Soldado(int x, int y) {
		super("Soldado", 100, 500, x, y);
	}

	@Override
	public void atacar(Unidad adversario) {
		adversario.energia-=50;
		
	}

	@Override
	public void recibeDano(int cantidad) {
		this.energia-=cantidad;
		
	}

	@Override
	public String toString() {
		return "Soldado ["+super.toString()+"]";
	}
	
}
