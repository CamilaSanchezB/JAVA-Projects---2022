package prueba;

import modelo.*;

public class TestVehiculo {

	public static void main(String[] args) {
		Vehiculo a1 = new Auto("KSQ 160", 7, 5);
		Vehiculo co1=new Combi("JZO 338", 7, 24);
		Vehiculo vdc1=new VehiculoDeCarga("TNN 946", 7, 1.5);
		Camion ca1= new Camion("ABC 123", 15);
		Camion ca2= new Camion("DEF 456", 15);
		Camion ca3= new Camion("GHI 789", 15);
		ca2.setTrailer(new Trailer(150));
		ca3.setTrailer(new TrailerRefrigerado(250, -8.5));
		
		System.out.println(a1);
		System.out.println(co1);
		System.out.println(vdc1);
		System.out.println(ca1);
		System.out.println(ca2);
		System.out.println(ca3);
	}

}
