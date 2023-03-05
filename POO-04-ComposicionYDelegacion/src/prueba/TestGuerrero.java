package prueba;

import modelo.Arma;
import modelo.Armadura;
import modelo.Posicion;
import modelo.Guerrero;

public class TestGuerrero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arma arma1= new Arma("Espada", 100);
		Armadura armadura1= new Armadura("Pechera de hierro", 200);
		Posicion pos= new Posicion();
		pos.setX(-1);
		pos.setY(0);
		Guerrero g1= new Guerrero("G1", 100, 15);
		g1.setArma(arma1);
		g1.setPosicion(pos);
		Guerrero g2= new Guerrero("G2", 1000, 20);
		g2.setArmadura(armadura1);
		g2.setPosicion(pos);
		System.out.println(g1);
		System.out.println(g2);
		for(int i=0; i<11; i++) {
			g1.atacar(g2);
		}
		System.out.println(g1);
		System.out.println(g2);
	}

}
