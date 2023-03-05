package modelo;

public class DestructorEstelar extends NaveEspacial{
	protected int cantidadTripulantes;
	public DestructorEstelar(double posicionX, double posicionY) {
		super(posicionX, posicionY);
		this.energia = 1000;
	}
	
	public int getCantidadTripulantes() {
		return cantidadTripulantes;
	}

	public void setCantidadTripulantes(int cantidadTripulantes) {
		this.cantidadTripulantes = cantidadTripulantes;
	}

	@Override	
	public void ataca(NaveEspacial adversario) {
		adversario.energia-=200;		
	}
	
	@Override
	public void Mueve(double x, double y) {
		super.Mueve(x-x*0.5, y-y*0.5);
	}

	@Override
	public String toString() {
		return "DestructorEstelar ["+ super.toString() + ", cantidadTripulantes=" + cantidadTripulantes+"]";
	}
	
	
}
