package modelo;

public abstract class CuentaBancaria {
	protected String titular;
	protected double saldo;
	public CuentaBancaria(String titular) {
		this.titular = titular;
		saldo = 0;
	}

	public String getTitular() {
		return titular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double cantidad) {
		saldo+=cantidad;
	}
	public abstract boolean extraer(double cantidad);

	@Override
	public String toString() {
		return "titular=" + titular + ", saldo=" + saldo;
	}
	
	
}
