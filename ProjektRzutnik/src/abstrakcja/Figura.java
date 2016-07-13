package abstrakcja;

public abstract class Figura {

	private int x;
	private int y;
	public Figura(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public abstract void rysuj();
	public abstract void wymaz();
	public void przesun(int dx, int dy){
		x += dx;
		y += dy;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
}
