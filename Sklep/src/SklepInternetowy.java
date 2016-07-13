/** 
 * 
 * @author Tomasz Mazur
 *
 */

public class SklepInternetowy {
	
	String nip = new String();
	String nazwa = new String();
	String adres = new String();
	Koszyk[] koszyki; int index;
	
	SklepInternetowy(String nip, String nazwa, String adres, int maxKoszy)
	{
		this.nip=nip;
		this.nazwa=nazwa;
		this.adres=adres;
		koszyki = new Koszyk[maxKoszy];
	}
	
	void informacja()
	{
		System.out.println("SKLEP : "+nazwa+" NIP: "+nip+" w "+adres);
	}
	/**
	 * Funkcja dodaje koszyki do pojemnika na nie
	 * @param k - obiekt klasy koszyk, czyli po prostu koszyk
	 */
	void dodajKoszyk(Koszyk k)
	{
		koszyki[index]=k;
		index++;
	}
	/**
	 * wypiszKoszyki wypisuje dodane koszyki
	 */
	void wypiszKoszyki()
	{
			for(int i=0; i<index; i++)
			System.out.println(koszyki[i].toString(nip,nazwa));
	}

	public static void main(String[] args) 
	{
		
		SklepInternetowy allegro = new SklepInternetowy("1234567","Allegro","Krakow",5);
		
		Pozycja p1 = new Pozycja("Telewizor",1,1222.30);
		Pozycja p2 = new Pozycja("Mysz",3,21.40);
		Pozycja p3 = new Pozycja("Koszula",2,29.90);
		Koszyk k1 = new Koszyk(3000,3,"99");
		
		k1.dodajPozycje(p1); 	p1.obliczWartosc();
		k1.dodajPozycje(p2); 	p2.obliczWartosc();
		k1.dodajPozycje(p3);	p3.obliczWartosc();
		
		
		allegro.dodajKoszyk(k1);
		allegro.wypiszKoszyki();
		
		
		// TODO Auto-generated method stub

	}

}
