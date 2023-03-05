package prueba;

import modelo.Persona;

public class PruebaPersona {

	public static void main(String[] args) {
		//Persona p1=new Persona("Lautaro");
		//Persona p1=new Persona("Lautaro",14);
		Persona p1=new Persona("Camila", 17, "camisb@gmail.com");
		System.out.println(p1+"\nEs mayor: "+p1.SosMayor()+" \nLa letra 'a' aparece "+p1.repeticionesDeLetra('a')+" veces");

	}

}
