package modelo;

public class CazaLigero extends NaveEspacial{

	public CazaLigero(double posicionX, double posicionY) {
		super(posicionX, posicionY);
		this.energia = 500;
	}

	@Override
	public void ataca(NaveEspacial adversario) {
		adversario.energia-=50;
	}

	@Override
	public String toString() {
		return "CazaLigero [" + super.toString() + "]";
	}
	
}
