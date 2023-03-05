package modelo;

public class TorretaVigilancia extends Edificio implements IHostil{
	public TorretaVigilancia(int x, int y) {
		super("Torreta Vigilancia", 200, 2000, x, y);
		this.construccion.setTiempoConstruccion(40);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Unidad adversario) {
		adversario.energia -= 10;
	}
	
	@Override
	public void recibeDano(int cantidad) {
		// TODO Auto-generated method stub
		this.energia -= cantidad;
	}

	@Override
	public String toString() {
		return "TorretaVigilancia ["+super.toString()+"]";
	}
	

}
