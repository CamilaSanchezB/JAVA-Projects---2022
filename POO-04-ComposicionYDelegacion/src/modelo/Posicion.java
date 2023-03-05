package modelo;

public class Posicion {
	private double x;
	private double y;

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public void mover(double inc_x, double inc_y) {
		x+=inc_x;
		y+=inc_y;
	}
	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}
	
}
