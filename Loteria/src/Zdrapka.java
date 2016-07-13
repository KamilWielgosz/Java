import java.util.LinkedList;
import java.util.Random;

public class Zdrapka
{

	String nazwaZdrapki = new String();
	int ileSztuk;
	double cena;
	double suma;
	int tabWylosowane[] = new int[6];
	int trafione = 0;
	Loteria loteria;
	double wygrana;
	
	String tabZdrapane[] = new String[3];
	
	LinkedList m1 = new LinkedList();
	Random generator1 = new Random();

	void dodajLoterie(Loteria l){
		loteria = l;
	}
	

	Zdrapka(String nazwa, int ile, double cena, String zdrapane1, String zdrapane2, String zdrapane3)
	{
		nazwaZdrapki=nazwa;
		ileSztuk=ile;
		this.cena=cena;
		tabZdrapane[0] = zdrapane1;
		tabZdrapane[1] = zdrapane2;
		tabZdrapane[2] = zdrapane3;
	}
	
	
	
	void sprawdzWygrana(){
		
		
	}
	
	

	void obliczWartosc()
	{
		suma=ileSztuk*cena;	
	}

	public String toString()
	{
		String wyjscie=new String();
		wyjscie = ("\n"+nazwaZdrapki+" "+cena+" zl "+ileSztuk+"szt. razem "+suma+" zl TRAFIONE: " + trafione + " WYGRALES: " + wygrana + " zl");
		return wyjscie;
	}
	
}
