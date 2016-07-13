
public class Pozycja
{

	String nazwaTowaru = new String();
	int ileSztuk;
	double cena;
	double suma;
	
	/**
	 * Konstruktor ustalajacy wartosci atrybutow produktu
	 * @param nazwa - nazwa dodawanego produktu
	 * @param ile 	 - ile sztuk danego produktu
	 * @param cena 	 - po jakiej cenie za sztuke
	 */
	Pozycja(String nazwa, int ile, double cena)
	{
		nazwaTowaru=nazwa;
		ileSztuk=ile;
		this.cena=cena;
	}
	
	/**
	 * oblicza wartosc sumy(oplaty) za pozycje
	 */
	void obliczWartosc()
	{
		suma=ileSztuk*cena;	
	}
	/**
	 * 
	 * @param wartosc - wartosc danej pozycji zwracanej przez funkcje obliczWartosc
	 * @return wyjscie - string jako wypis wszystkich atrybutow pozycji z suma do zaplaty
	 */
	
	public String toString()
	{
		String wyjscie=new String();
		wyjscie = (nazwaTowaru+" "+cena+" zl "+ileSztuk+"szt. razem "+suma+" zl");
		return wyjscie;
	}
	
}
