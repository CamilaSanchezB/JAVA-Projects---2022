package modelo;

public class Arquero extends Personaje{
	protected int alcanceDeAtaqueLargo;
	protected int danioDeAtaqueLargo;
	protected int cantidadFlechas;
	public Arquero(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.vitalidad = 400;
		this.alcanceDeAtaque = 5;
		this.danioDeAtaque = 5;
		this.alcanceDeAtaqueLargo= 100;
		this.danioDeAtaqueLargo=20;
		this.cantidadFlechas = 20;
	}
	@Override
	public boolean atacar(Personaje adversario) {
		boolean respuesta=false;
		if(this.cantidadFlechas>0) {
			if(this.distanciaA(adversario)<=100) {
				adversario.recibeDanio(this.danioDeAtaqueLargo);
				this.cantidadFlechas--;
				respuesta = true;
			}
		}else {
			respuesta = super.atacar(adversario);
		}
		return respuesta;
	}
	
	public void recuperarFlecha(int cantidad) {
		this.cantidadFlechas+=cantidad;
	}
	@Override
	public String toString() {
		return "Arquero [" + super.toString() +" alcanceDeAtaqueLargo=" + alcanceDeAtaqueLargo + ", danioDeAtaqueLargo=" + danioDeAtaqueLargo
				+ ", cantidadFlechas=" + cantidadFlechas + "]";
	}
	
	
}