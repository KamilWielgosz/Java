

public class Silnik {
	private int ileKoni;
	
	public Silnik(int x){
		ileKoni = x;
		System.out.println("Silnik()");
	}

	@Override
	public String toString() {
		return "Silnik [ileKoni=" + ileKoni + "]";
	}
	
	

}
