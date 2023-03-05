package prueba;

import modelo.*;

public class TestUnidad {
	public static void main(String[] args) {
		Soldado s1 = new Soldado(10, 4);
		Medico m1 = new Medico(5, 5);
		Cuartel c1 = new Cuartel(1,3);
		TorretaVigilancia t1 = new TorretaVigilancia(5,4);
		
		System.out.println(s1 + "\n" + m1 + "\n" + c1 +"\n" + t1 + "\n");
		s1.atacar(t1);
		t1.atacar(c1);
		s1.atacar(m1);
		t1.atacar(s1);
		m1.mover(3, -1);
		
		System.out.println(s1 + "\n" + m1 + "\n" + c1 +"\n" + t1 + "\n");
	}
}
