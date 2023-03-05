package modelo;

public class Gato extends Animal implements Emisor_de_Sonido{

	
	public Gato(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emiteSonido() {
		System.out.println("Miau");		
	}
	
}
