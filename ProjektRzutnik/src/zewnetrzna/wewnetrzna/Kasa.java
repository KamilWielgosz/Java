package zewnetrzna.wewnetrzna;

public class Kasa {
	private int x = 5;
	String nazwa;
	Kasa(String str){
		nazwa = str;
	}
	
	public Paragon createParagon(){
		return new Paragon(5);
	}
	
	class Paragon{
		private int id;
		private Paragon(int x){
			id = x;
		}
		
	    class Pozycja {
	    	String co;
	    	int ile;
	    	float cena;
	    	Pozycja(String co, int ile, float cena){
	    		this.co = co;
	    		this.ile = ile;
	    		this.cena = cena;
	    	}
	    	
	    	
	    	
			@Override
			public String toString() {
				return "Pozycja [co=" + co + ", ile=" + ile + ", cena=" + cena + "]"+ ", id=" + id + "]";
			}
	    	
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Kasa k = new Kasa("Kasa fiskalna");
       //Kasa.Paragon p = k.new Paragon(3);
       Kasa.Paragon p = k.createParagon();
	}

}
