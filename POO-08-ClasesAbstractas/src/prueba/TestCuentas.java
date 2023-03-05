package prueba;

import modelo.CajaDeAhorro;
import modelo.CuentaBancaria;
import modelo.CuentaCorriente;
import modelo.CuentaUniversitaria;

public class TestCuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fin="";
		for (int i = 0; i < 40; i++) {
			fin+="-";
		}
		CuentaBancaria cda = new CajaDeAhorro("Pablo");
		CuentaBancaria cc = new CuentaCorriente("Carolina", 5000);
		CuentaBancaria cu = new CuentaUniversitaria("Lautaro");
		
		System.out.println(cda);
		System.out.println(cc);
		System.out.println(cu);
		System.out.println(fin);
		
		cda.depositar(4550.75);
		cc.depositar(10000);
		cu.depositar(1700);
		
		System.out.println(cda);
		System.out.println(cc);
		System.out.println(cu);
		System.out.println(fin);
		
		cda.extraer(3000);
		cc.extraer(10000);
		cu.extraer(700);
		
		System.out.println(cda);
		System.out.println(cc);
		System.out.println(cu);
		System.out.println(fin);
		
		cda.extraer(1000);
		cc.extraer(5000);
		cu.extraer(300);
		
		System.out.println(cda);
		System.out.println(cc);
		System.out.println(cu);
		System.out.println(fin);
		
		cda.extraer(1000);
		cc.extraer(5000);
		cu.extraer(300);
		
		System.out.println(cda);
		System.out.println(cc);
		System.out.println(cu);
	}

}
