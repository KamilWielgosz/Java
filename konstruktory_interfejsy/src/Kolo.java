public class Kolo extends Figura{

	private double promien;
	
	public Kolo(){
		this(1.0);
	}
	
	public Kolo(double r){
		this(r, "Granatowy", true);
	}
	
	public Kolo(double r, String k, boolean w){
		super(k, w);
		promien = r;
	}
	
	public double getPromien(){
		return promien;
	}
	
	public final double obliczObwod(){
		return 2*Math.PI*promien;
	}
	
	public final double obliczPole(){
		return Math.PI*promien*promien;
	}
	
	public String toString(){
		return "Nazwa: " + getClass().getName() + ", Promien: " + promien + ", Obwod: " + obliczObwod() + ", Pole: " + obliczPole()+ " ," + super.toString();
	}
	
	
	public static void main(String[] args) {
		
		Kolo kolo = new Kolo(100, "Zielony", false);
		System.out.println(kolo);

	}

//	@Override
//	public void draw() {
//		// TODO Auto-generated method stub
//		
//	}

}
