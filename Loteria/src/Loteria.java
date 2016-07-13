import java.util.Date;
import java.util.LinkedList;
import java.util.Random;
public class Loteria
{

	Kupon[] kupon;
	Zdrapka[] zdrapka;
	int ileDanych;
	double maksymalnaIloscZdrapek;
	int wskaznik=0;
	int wskaznik1=0;
	String nrUrzadzenia;
	Date data= new Date();
	
    int tab[] = new int[6];
	
	LinkedList m = new LinkedList();
	Random generator = new Random();
	
	String tabElementy[] = {"slonik", "zyrafa", "kot"};

	
    String tabLoteriaZdrapka[] = new String[3];

	
	Loteria()
	{
		maksymalnaIloscZdrapek=100;
		kupon=new Kupon[5];
		nrUrzadzenia = "1234";
	}

	
	Loteria(double maksWartosc, int iloscPozycji, String numer)
	{
		maksymalnaIloscZdrapek=maksWartosc;
		kupon=new Kupon[iloscPozycji];
		nrUrzadzenia = numer;
	}

	/**
	 * Funkcja dodaje kupon do tablicy
	 * @param p - obiekt klasy Kupon, czyli po prostu Kupon
	 */

	void dodajKupon(Kupon p)
	{
		kupon[wskaznik]=p;
		wskaznik++;
		
	}
	

	
	
	void losowanie(){
		 
		for(int i=1; i<25; i++) {
		 
		   m.add(i);
		}
		

		for(int i = 0; i < 6; i++){
			//System.out.println(m.get(i));
			int b = generator.nextInt(20 - i);			
			tab[i] = (int)m.get(b);		
			m.remove(b);
		}
		
		
	}
	
	
	void losowanieZdrapka(){
		
		for(int i = 0; i < 3; i++){
			tabLoteriaZdrapka[i] = tabElementy[generator.nextInt(3)];
		}
		
	}


	double obliczWartosc(){
		
		double sumaKoszyka=0;
		for(int i=0; i<kupon.length; i++){
			if(sumaKoszyka>=maksymalnaIloscZdrapek) break;
			sumaKoszyka+=kupon[i].suma;
		}
		return sumaKoszyka;
	}

	
	
	public String toString(String nip,String nazwa){
		
		String naglowek=new String();
		String zawartosc=new String();
		naglowek=("SKLEP "+nazwa+" NIP: "+nip+" urzadzenie: "+nrUrzadzenia);
		for(int i=0; i<kupon.length; i++)
		zawartosc+=(kupon[i]+" ");
		zawartosc+=("\nKoszt kuponow: "+obliczWartosc());
		
		return naglowek+zawartosc;
		

	}
	

}
