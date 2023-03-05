package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Juego {

	private ArrayList<Banda> bandas = new ArrayList<Banda>();
	
	public void agregarBanda(Banda banda) {
		 this.bandas.add(banda);
	}
	public void eliminarBanda(Banda banda) {
		this.bandas.remove(banda);
	}
	public Iterator<Banda> getBanda(){
		return this.bandas.iterator();
	}
	
	public Banda enfrentar(Banda banda, Banda banda2, String atributo) {
		Banda rta = null;
		if(atributo.equalsIgnoreCase("AniosJuntos")) {
			rta = banda.enfrentaAniosJuntos(banda2);
		}else if (atributo.equalsIgnoreCase("CantidadIntegrantes")) {
			rta = banda.enfrentaCantidadIntegrantes(banda2);
		}else if (atributo.equalsIgnoreCase("Premios")) {
			rta = banda.enfrentaPremios(banda2);
		}else if (atributo.equalsIgnoreCase("TopGlobal")) {
			rta = banda.enfrentaTopGlobal(banda2);
		}
		return rta;
	}
}
