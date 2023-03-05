package modelo;

public class CuentaCorriente extends CuentaBancaria{
	private double tope;
	public CuentaCorriente(String titular, double tope) {
		super(titular);
		this.tope = tope*-1;
	}
	
	public double getTope() {
		return tope;
	}

	public void setTope(double tope) {
		this.tope = tope*-1;
	}

	@Override
	public boolean extraer(double cantidad) {
		boolean rta = false;
		if(saldo-cantidad >= tope) {
			saldo-=cantidad;
			rta = true;
		}
		return rta;
	}

	@Override
	public String toString() {
		return "CuentaCorriente ["+ super.toString() +" tope=" + tope + "]";
	}

}
