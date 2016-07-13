public class Prostokat extends Figura {

	private double bokA;
	private double bokB;
	
	public Prostokat(){
		this(1.0, 2.0);
	}
	
	public Prostokat(double a, double b){
		this(1.0, 2.0, "Granatowy", false);
	}
	
	public Prostokat(double a, double b, String k, boolean w){
		super(k, w);
		bokA = a;
		bokB = b;
	}
	
	public double obliczPole(){
		return bokA*bokB;
	}
	
	public double obliczObwod(){
		return 2*(bokA + bokB);
	}
	
	public String toString(){
		return "Nazwa: " + getClass().getName() + ", Bok a: " + bokA + ", Bok b: " + bokB + ", Obwod: " + obliczObwod() + ", Pole: " + obliczPole() + ", " + super.toString();
	}
	
	public static void main(String[] args) {
	
		Prostokat pr = new Prostokat(2,4, "Zolty", true);
		System.out.println(pr);

	}

	//@Override
	//public void draw() {
		// TODO Auto-generated method stub
	//	System.out.println("Rysuje prostokat! ");
	}


