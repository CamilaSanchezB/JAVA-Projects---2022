package modelo;

public class Posicion implements Movible{
	private int x;
	private int y;
	@Override
	public int getPosx() {
		return x;
	}

	@Override
	public int getPosy() {
		return y;
	}

	@Override
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void incrementaPos(int valorX, int valorY) {
		x+=valorX;
		y+=valorY;
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}

}
