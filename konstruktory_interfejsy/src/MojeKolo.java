public class MojeKolo extends Kolo {

	public MojeKolo(double r){
		super(r);
	}
	
	/*public double obliczPole(){
		double promien = getPromien();
		
		return Math.PI*promien*promien;
	}*/
	
	public static void main(String[] args) {
		 
		MojeKolo mojekolo = new MojeKolo(10);
		
		System.out.println(mojekolo.obliczPole());

	}

}
