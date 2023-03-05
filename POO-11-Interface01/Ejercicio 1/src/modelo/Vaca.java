package modelo;

public class Vaca extends Animal implements Emisor_de_Sonido{

	public Vaca(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emiteSonido() {
		System.out.println("Mu");
	}

}
