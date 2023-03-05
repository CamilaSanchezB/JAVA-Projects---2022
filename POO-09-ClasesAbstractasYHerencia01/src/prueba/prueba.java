package prueba;
import modelo.*;
public class prueba {
	public static void main(String[] args) {
		DestructorEstelar n1 = new DestructorEstelar(5, 5);
		CazaLigero n2 = new CazaLigero(6.4, 6);
		
		n1.setCantidadTripulantes(20);
		n1.setNombre("La estrella de la muerte");
		System.out.println(n1);
		
		n2.setNombre("El halcón milenario");
		System.out.println(n2);
		
		n1.ataca(n2);
		n2.ataca(n1);
		
		n1.Mueve(10, 10);
		System.out.println(n1);
		
		n2.Mueve(10, 10);
		System.out.println(n2);
	}
}
