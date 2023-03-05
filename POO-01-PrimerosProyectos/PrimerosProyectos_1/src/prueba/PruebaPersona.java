package prueba;

import modelo.Persona;

public class PruebaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona();
		p1.setNombre("Lautaro");
		p1.setEdad(14);
		p1.setEmail("lautarosb@gmail.com");
		System.out.println(p1+"\nEs mayor: "+p1.SosMayor()+" \nLa letra 'a' aparece "+p1.repeticionesDeLetra('a')+" veces");

	}

}
