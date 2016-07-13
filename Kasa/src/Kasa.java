public class Kasa {
	
	String nip = new String();
	String nazwa = new String();
    String adres = new String();
    int numerUrzadzenia;    
    Paragon paragon[];
    
    
    public Kasa(String nip, String nazwa, String adres, int numerUrzadzenia){
    	
    	this.nip = nip;
    	this.nazwa = nazwa;
    	this.adres = adres;
    	this.numerUrzadzenia = numerUrzadzenia;
    	this.paragon = new Paragon[1];
    	
    }
    
    public void dodajParagon(Paragon par){
    	
    	paragon[0] = par;
    	
    }
    
	public void wypiszInfKasa(){
		
		System.out.println("nip: " + nip + " nazwa: " + nazwa + " adres: " + adres + " numerUrzadzenia: " + numerUrzadzenia);
		
	}
	
	public static void main(String[] args) {
		
		Kasa kasa = new Kasa("3349872", "Kasa1", "ul. Kwiatkowa", 5);
		
		Pozycja poz1 = new Pozycja("Jablka", 20, 2);
		Pozycja poz2 = new Pozycja("Gruszki", 5, 2);
		Pozycja poz3 = new Pozycja("Marchewka", 50, 8);
	
		Paragon paragon1 = new Paragon(3);
		paragon1.dodajPozycje(poz1);
		paragon1.dodajPozycje(poz2);
		paragon1.dodajPozycje(poz3);
		paragon1.obliczWartosc();
		
		kasa.dodajParagon(paragon1);
		
		System.out.println(poz1);
		System.out.println(poz2);
		System.out.println(poz3);
		kasa.wypiszInfKasa();
		System.out.println(paragon1);
	   		
	   // System.out.println(kasa.paragon[0]);
	
		
		
	}
    

}
