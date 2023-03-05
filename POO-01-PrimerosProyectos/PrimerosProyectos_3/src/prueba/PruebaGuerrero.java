package prueba;

import modelo.Guerrero;

public class PruebaGuerrero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guerrero g1=new Guerrero();
		g1.setNombre("David");
		g1.setVitalidad(1000);
		g1.setArmadura(1000);
		g1.setX(5);
		g1.setY(5);
		System.out.println(g1);
		g1.mover(10, 10);
		g1.recibeDano(800);
		System.out.println(g1);
		g1.mover(5, -5);
		g1.recibeDano(300);
		System.out.println(g1);
	}

}
