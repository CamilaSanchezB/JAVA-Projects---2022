package modelo;

public class RepresentacionEnConsola implements Dibujable{
	private Personaje personaje;
	public RepresentacionEnConsola(Personaje personaje) {
		this.personaje=personaje;
	}
	@Override
	public void dibujar() {
		System.out.println(personaje.getNombre());
	}

}
