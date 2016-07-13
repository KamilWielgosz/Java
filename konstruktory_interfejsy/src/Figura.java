public abstract class Figura {//implements Areable, Drawable{ //Klasa nadrzedna, inaczej super klasa

	String kolor;
	boolean wypelnienie;
	
	public Figura(){
		this("Czarny", false);
	}
	
	public Figura(String k, boolean w){
		kolor = k;
		wypelnienie = w;
	}
	
	
	public String toString(){
		return "Kolor: " + kolor + ", Wypelnienie: " + wypelnienie;
	}

	
	public static void main(String[] args) {

	}



	public abstract double obliczPole();
    public abstract double obliczObwod();
}
