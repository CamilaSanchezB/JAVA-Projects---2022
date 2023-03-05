package prueba;

import modelo.Ambulancia;

public class TestAmbulancia {
	public static void main(String[] args) {
		Ambulancia a = new Ambulancia();
		a.setNumeroChasis("A9478BC");
		a.setNumeroMotor("A5281BC");
		a.setPatente("JZO 338");
		a.emiteSonido();
	}
}
