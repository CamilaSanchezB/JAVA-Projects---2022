package prueba;
import modelo.Guerrero;
import modelo.Arquero;
import modelo.Caballero;
import modelo.Mago;
import modelo.Posicion;

public class TestJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arquero p1= new Arquero("Robin Hood", new Posicion(5,3));
		Caballero p2 = new Caballero("Aquiles", new Posicion(7,3));
		Guerrero p3 = new Guerrero("Taylor Swift", new Posicion(3,3));
		Mago p4 = new Mago("Dr Strange", new Posicion(5,4));
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4+"\n");
		
		p1.atacar(p3);
		p2.atacar(p4);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4+"\n");
		
		p4.curar(p3);
		p4.atacar(p2);
		p4.curar();
		p4.teletransportarse(new Posicion(7, -10));
		p3.atacar(p1);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4+"\n");
		
	}

}
