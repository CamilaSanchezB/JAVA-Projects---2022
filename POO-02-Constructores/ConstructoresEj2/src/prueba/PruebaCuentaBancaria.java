package prueba;

import modelo.CuentaBancaria;

public class PruebaCuentaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria c1= new CuentaBancaria("Camila");
		System.out.println(c1);
		c1.depositar(2500);
		c1.extraer(1000);
		c1.extraer(100000);
		c1.depositar(250.75);
		c1.depositar(100);
		System.out.println(c1);
	
	}

}
