

public class Samochod extends Pojazd{
	
	private Silnik s;
	int j = 15;
	
	public Samochod(int x, Silnik s){
		super(x);
		System.out.println("Samochod");
		this.s = s;
	}

	
	public static void main(String[] args){
		Pojazd s = new Samochod(250, new Silnik(105));
		//s.wLewo();
	}
	
	@Override
	public void wLewo() {
		// TODO Auto-generated method stub
		System.out.println("Samochod wLewo()" + j);
	}


	public Silnik getS() {
		return s;
	}


	public void setS(Silnik s) {
		this.s = s;
	}


	@Override
	public void jedz() {
		// TODO Auto-generated method stub
 
	}
	
	

}
