package modelo;

public class Banda {
	private String nombre;
	private int aniosJuntos;
	private int topGlobal;
	private int premios;
	private int cantidadIntegrantes;

	public Banda(String nombre, int aniosJuntos, int topGlobal, int premios, int cantidadIntegrantes) {
		this.nombre = nombre;
		this.aniosJuntos = aniosJuntos;
		this.topGlobal = topGlobal;
		this.premios = premios;
		this.cantidadIntegrantes = cantidadIntegrantes;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidadIntegrantes() {
		return cantidadIntegrantes;
	}

	public int getAniosJuntos() {
		return aniosJuntos;
	}

	public int getTopGlobal() {
		return topGlobal;
	}

	public int getPremios() {
		return premios;
	}

	public Banda enfrentaCantidadIntegrantes(Banda otro) {
		Banda rta = null;
		if (this.cantidadIntegrantes > otro.cantidadIntegrantes) {
			rta = this;
		} else if (this.cantidadIntegrantes < otro.cantidadIntegrantes) {
			rta = otro;
		}
		return rta;
	}

	@Override
	public String toString() {
		return "Banda [nombre=" + nombre + ", aniosJuntos=" + aniosJuntos + ", topGlobal=" + topGlobal + ", premios="
				+ premios + ", cantidadIntegrantes=" + cantidadIntegrantes + "]";
	}

	public Banda enfrentaAniosJuntos(Banda otro) {
		Banda rta = null;
		if (this.aniosJuntos > otro.aniosJuntos) {
			rta = this;
		} else if (this.aniosJuntos < otro.aniosJuntos) {
			rta = otro;
		}
		return rta;
	}

	public Banda enfrentaTopGlobal(Banda otro) {
		Banda rta = null;
		if (this.topGlobal < otro.topGlobal) {
			rta = this;
		} else if (this.topGlobal > otro.topGlobal) {
			rta = otro;
		}
		return rta;
	}

	public Banda enfrentaPremios(Banda otro) {
		Banda rta = null;
		if (this.premios > otro.premios) {
			rta = this;
		} else if (this.premios < otro.premios) {
			rta = otro;
		}
		return rta;
	}

}
