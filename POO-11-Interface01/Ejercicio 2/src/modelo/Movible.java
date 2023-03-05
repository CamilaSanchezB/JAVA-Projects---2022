package modelo;

public interface Movible {
	int getPosx();
	int getPosy();
	void setXY(int x, int y);
	void incrementaPos(int valorX, int valorY);
}
