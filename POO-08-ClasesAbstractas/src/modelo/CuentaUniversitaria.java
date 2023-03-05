package modelo;

public class CuentaUniversitaria extends CuentaBancaria{
	private double cantExtraccionDiaria=0;

	public CuentaUniversitaria(String titular) {
		super(titular);
	}

	public double getCantExtraccionDiaria() {
		return cantExtraccionDiaria;
	}


	@Override
	public boolean extraer(double cantidad) {
		boolean rta = false;
		if (cantidad + cantExtraccionDiaria <= 1000) {
			saldo-=cantidad;
			cantExtraccionDiaria+=cantidad;
			rta = true;
		}
		return rta;
	}

	@Override
	public String toString() {
		return "CuentaUniversitaria ["+ super.toString() +" cantExtraccionDiaria=" + cantExtraccionDiaria + "]";
	}
	
	
}
