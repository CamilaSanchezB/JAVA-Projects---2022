package modelo;

public class CuentaBancaria {
private String titular;
private double saldo;
private int cantidadDepositos;
private int cantidadExtraciones;

/*
La clase CuentaBancaria no debe permitir cambiar ni el titular ni el saldo en forma directa (ya no tiene ningún
setter), escribe un constructor con un parámetro String para inicializar el titular.
 */
public CuentaBancaria(String titular) {
	this.titular=titular;
}
public String getTitular() {
	return titular;
}
public double getSaldo() {
	return saldo;
}
public int getCantidadDepositos() {
	return cantidadDepositos;
}
public int getCantidadExtraciones() {
	return cantidadExtraciones;
}
public void depositar(double cantidad) {
	saldo+=cantidad;
	cantidadDepositos++;
}
public boolean extraer(double cantidad) {
	if (saldo>=cantidad) {
		saldo-=cantidad;
		cantidadExtraciones++;
		return true;
	}
	else return false;
}
@Override
public String toString() {
	return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + ", cantidadDepositos=" + cantidadDepositos
			+ ", cantidadExtraciones=" + cantidadExtraciones + "]";
}


}
