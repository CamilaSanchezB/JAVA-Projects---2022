package modelo;

public class Perro extends Animal implements Emisor_de_Sonido{

	public Perro(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void emiteSonido() {
		System.out.println("Guau");
	}

}
