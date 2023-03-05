package prueba;

import modelo.CuentaBancaria;

public class PruebaCuentaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria c1= new CuentaBancaria();
		c1.setTitular("Camila");
		System.out.println(c1);
		c1.depositar(2500);
		System.out.println("Saldo: "+c1.getSaldo()+"\nCantidad de depositos: "+c1.getCantidadDepositos());
		c1.extraer(1000);
		System.out.println("Saldo: "+c1.getSaldo()+"\nCantidad de extracciones: "+c1.getCantidadExtraciones());
		c1.extraer(100000);
		System.out.println("Saldo: "+c1.getSaldo()+"\nCantidad de extracciones: "+c1.getCantidadExtraciones());
		c1.depositar(250.75);
		System.out.println("Saldo: "+c1.getSaldo()+"\nCantidad de depositos: "+c1.getCantidadDepositos());
		c1.extraer(150);
		System.out.println("Saldo: "+c1.getSaldo()+"\nCantidad de extracciones: "+c1.getCantidadExtraciones());
		
	}

}
