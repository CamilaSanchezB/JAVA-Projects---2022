package modelo;

public class Ambulancia extends Vehiculo implements Emisor_de_Sonido{

	@Override
	public void emiteSonido() {
		System.out.println("sirena sonando");
	}
	
}
