import java.util.Date;

public class Koszyk 
{

	Pozycja[] pozycje;
	int ileDanych;
	double maksymalnaWartoscKoszyka;
	int wskaznik=0;
	String nrUrzadzenia;
	Date data= new Date();
	/**
	 * Konstruktor bezparametrowy uzupelniajacy pola wartosciami domyslnymy
	 */
	Koszyk()
	{
		maksymalnaWartoscKoszyka=100;
		pozycje=new Pozycja[5];
		nrUrzadzenia = "1234";
	}
	/**
	 * Konstruktor parametryczny
	 * @param maksWartosc - maksymalna wartosc koszyka
	 * @param iloscPozycji - ilosc mozliwych pozycji w koszyku
	 * @param numer - numer urzadzenia
	 */
	Koszyk(double maksWartosc, int iloscPozycji, String numer)
	{
		maksymalnaWartoscKoszyka=maksWartosc;
		pozycje=new Pozycja[iloscPozycji];
		nrUrzadzenia = numer;
	}
	/**
	 * Funkcja dodajca pozycje do Koszyka
	 * @param p - obiekt klasy pozycja
	 */
	void dodajPozycje(Pozycja p)
	{
		pozycje[wskaznik]=p;
		wskaznik++;
		
	}
	/**
	 * 
	 * @return sumaKoszyka - zwraca calkowita wartosc Koszyka
	 */
	double obliczWartosc(){
		
		double sumaKoszyka=0;
		for(int i=0; i<pozycje.length; i++){
			if(sumaKoszyka>=maksymalnaWartoscKoszyka) break;
			sumaKoszyka+=pozycje[i].suma;
		}
		return sumaKoszyka;
	}
	/**
	 * 
	 * @param nip - informacja o nip sklepu
	 * @param nazwa - informacja o nazwie sklepu
	 * @return zwraca lancuch znakow z wszystkimi informacjami o sklepie i dokonanym zakupie(koszyku)
	 */
	public String toString(String nip,String nazwa){
		
		String naglowek=new String();
		String zawartosc=new String();
		naglowek=("SKLEP "+nazwa+" NIP: "+nip+" urzadzenie: "+nrUrzadzenia);
		for(int i=0; i<pozycje.length; i++)
		zawartosc+=(pozycje[i]+" ");
		zawartosc+=(" suma "+obliczWartosc());
		
		return naglowek+zawartosc;
		

	}
	

}
