package modelo;

public class CajaDeAhorro extends CuentaBancaria{

	private static int maxExtraccionMensual = 2;
	private int cantExtraccionMensual;
		
	public CajaDeAhorro(String titular) {
		super(titular);
	}

	public int getMaxExtraccionMensual() {
		return maxExtraccionMensual;
	}

	public int getCantExtraccionMensual() {
		return cantExtraccionMensual;
	}

	@Override
	public boolean extraer(double cantidad) {
		boolean rta = false;
		if(cantExtraccionMensual<maxExtraccionMensual && saldo-cantidad>=0) {
			saldo-=cantidad;
			cantExtraccionMensual++;
			rta = true;
		}
		return rta;
	}

	@Override
	public String toString() {
		return "CajaDeAhorro ["+super.toString()+" maxExtraccionMensual=" + maxExtraccionMensual + ", cantExtraccionMensual="
				+ cantExtraccionMensual + "]";
	}

}
