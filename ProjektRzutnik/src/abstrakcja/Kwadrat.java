package abstrakcja;

public class Kwadrat extends Figura {

	public Kwadrat(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rysuj() {
		// TODO Auto-generated method stub
          System.out.println("Kwadrat rysuj()");
	}

	@Override
	public void wymaz() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Figura f = new Kwadrat(5, -1);
           f.rysuj();
	}

}
