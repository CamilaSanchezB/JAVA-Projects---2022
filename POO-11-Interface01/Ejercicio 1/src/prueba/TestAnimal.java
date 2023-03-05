package prueba;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.Animal;
import modelo.Gato;
import modelo.Perro;
import modelo.Pollito;
import modelo.Vaca;

public class TestAnimal {
	private ArrayList<Animal>animalesEmisoresDeSonido = new ArrayList<Animal>();
	public void agregarAnimal(Animal animal) {
		animalesEmisoresDeSonido.add(animal);
	}
	public void EliminarAnimal(Animal animal) {
		animalesEmisoresDeSonido.remove(animal);
	}

	public int getCantidadDeAnimalesEmisoresDeSonido() {
		return animalesEmisoresDeSonido.size();
	}

	public void emitirSonidos() {
		Iterator<Animal> it = animalesEmisoresDeSonido.iterator();
	    while(it.hasNext()) {
	      it.next().emiteSonido();
	    }
	}
	public static void main(String[] args) {
		Animal a1= new Perro("Homero", 9);
		Animal a2= new Gato("Chemita", 2);
		Animal a3= new Vaca("Lola", 4);
		Animal a4= new Pollito("Piolin", 1);
		TestAnimal ta = new TestAnimal();
		Animal[] animales = new Animal[] {a1, a2, a3, a4};
		for (Animal animal : animales) {
			ta.agregarAnimal(animal);
		}
		ta.emitirSonidos();
	}

}
