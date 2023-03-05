package modelo;

public class Pollito extends Animal implements Emisor_de_Sonido{

	public Pollito(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emiteSonido() {
		System.out.println("Pio");
	}

}
