public class Telewizor {
	public String marka;
	public int cale;
	
    //konstruktor
	public Telewizor(String marka, int cale){
		this.marka = marka;
		this.cale = cale;
	}
	
	//przeslonieta metoda
	public String toString(){
		return "Telewizor: " + marka + " " + cale;
	}
}

