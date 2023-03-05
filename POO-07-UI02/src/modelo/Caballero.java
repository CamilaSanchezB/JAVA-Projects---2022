package modelo;

public class Caballero extends Personaje{
	protected int armadura;
	public Caballero(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.vitalidad=800;
		this.alcanceDeAtaque=5;
		this.danioDeAtaque=15;
		this.armadura=500;
	}
	@Override
	public void recibeDanio(int cantidad) {
		if (this.armadura >0) {
			this.armadura -= cantidad;
			if(this.armadura <0) {
				this.vitalidad+= this.armadura;
				this.armadura = 0;
			}
		}else {this.vitalidad -= cantidad;}
	}
	@Override
	public String toString() {
		return "Caballero ["+super.toString()+" armadura=" + armadura + "]";
	}
	
}