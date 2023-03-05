package modelo;

public class Mago extends Personaje{
	protected int cantidadMagia;
	protected int danioAtaqueMagico;
	public Mago(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.vitalidad = 300;
		this.alcanceDeAtaque = 5;
		this.danioDeAtaque=3;
		this.cantidadMagia=5000;
		this.danioAtaqueMagico=10;
	}
	
	@Override
	public boolean atacar(Personaje adversario) {
		boolean respuesta = false;
		if (cantidadMagia >= 500) {
			adversario.recibeDanio(danioAtaqueMagico);
			this.cantidadMagia-=500;
			respuesta = true;
		}else {
			respuesta = super.atacar(adversario);
		}
		return respuesta;
	}
	
	public void recuperaMagia(int cantidad) {
		this.cantidadMagia+=cantidad;
	}
	
	public void teletransportarse(Posicion nuevaPos) {
		if(this.cantidadMagia>=2000) {
			this.posicion=nuevaPos;
			this.cantidadMagia -=2000;
		}
	}
	
	public void curar() {
		if(this.cantidadMagia>=1000) {
			this.vitalidad+=100;
			this.cantidadMagia-=1000;
		}
	}
	
	public void curar(Personaje objetivo) {
		if(this.cantidadMagia>=1000) {
			objetivo.vitalidad+=100;
			this.cantidadMagia-=1000;
		}
	}

	@Override
	public String toString() {
		return "Mago ["+super.toString()+" cantidadMagia=" + cantidadMagia + ", danioAtaqueMagico=" + danioAtaqueMagico + "]";
	}
	
}