/** 
 * 
 * @author Kamil Wielgosz
 *
 */

public class PunktLotto {
	
	String nip = new String();
	String nazwa = new String();
	String adres = new String();
	Loteria[] loteria; int index;
	
	PunktLotto(String nip, String nazwa, String adres, int maxLoteri)
	{
		this.nip=nip;
		this.nazwa=nazwa;
		this.adres=adres;
		loteria = new Loteria[maxLoteri];
	}
	
	void informacja()
	{
		System.out.println("SKLEP : "+nazwa+" NIP: "+nip+" w "+adres);
	}
	
	/**
	 * Funkcja dodaje loterie do tablicy
	 * @param k - obiekt klasy loteria, czyli po prostu loteria
	 */
	
	void dodajLoterie(Loteria k)
	{
		loteria[index]=k;
		index++;
	}

	
	
	void wypiszKoszyki()
	{
			for(int i=0; i<index; i++)
			System.out.println(loteria[i].toString(nip,nazwa));
	}

	public static void main(String[] args) 
	{
		
		PunktLotto punkt = new PunktLotto("1234567","Punkt Lotto 1","Krakow",5);
		
		Kupon p1 = new Kupon("Kupon1",1, 4.0);
		Kupon p2 = new Kupon("Kupon2",1, 4.0);
		Kupon p3 = new Kupon("Kupon3",1, 4.0);
		
		p1.losuj();
		p2.losuj();
		p3.losuj();
		
		Loteria k1 = new Loteria(3000,3,"99");
		k1.losowanie();
		
		p1.dodajLoterie(k1);
		p2.dodajLoterie(k1);
		p3.dodajLoterie(k1);
		
		p1.sprawdzWygrana();
		p2.sprawdzWygrana();
		p3.sprawdzWygrana();
		
		k1.dodajKupon(p1); 	p1.obliczWartosc();
		k1.dodajKupon(p2); 	p2.obliczWartosc();
		k1.dodajKupon(p3);	p3.obliczWartosc();
		
		
		punkt.dodajLoterie(k1);
		punkt.wypiszKoszyki();	
		
		// --------------------------------------------------------
		Loteria k2 = new Loteria(3000,3,"99");
		
		Zdrapka z1 = new Zdrapka("Zdrapka1", 1, 2.0, "slonik", "zyrafa", "slonik");
		Zdrapka z2 = new Zdrapka("Zdrapka1", 1, 2.0, "slonik", "zyrafa", "slonik");
		Zdrapka z3 = new Zdrapka("Zdrapka1", 1, 2.0, "slonik", "zyrafa", "slonik");

		z1.dodajLoterie(k2);
		z2.dodajLoterie(k2);
		z3.dodajLoterie(k2);
		
		k2.losowanieZdrapka();
		
		
        System.out.println(z1);	
        /*
		k2.dodajZdrapke(z1); 	z1.obliczWartosc();
		k2.dodajZdrapke(z2); 	z2.obliczWartosc();
		k2.dodajZdrapke(z3);	z3.obliczWartosc();
		*/
	}

}
