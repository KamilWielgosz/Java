public class Pozycja {
	
	String nazwaTowaru = new String();
	int ileSztuk;
	double cena;
	double wartoscWszystkich = 0;
	
	public Pozycja(String nazwaTowaru, int ileSztuk, double cena){ //Konstruktor
		
		this.nazwaTowaru = nazwaTowaru;
		this.ileSztuk = ileSztuk;
		this.cena = cena;
		this.obliczWartosc();
	}
	
	public void obliczWartosc(){
		
		wartoscWszystkich = cena*ileSztuk;
	}
	
	
	public String toString(){
		return "Nazwa towaru: " + nazwaTowaru + " cena:" + cena + " liczba sztuk: "+ ileSztuk + " wartosc wszystkich sztuk: " + wartoscWszystkich;
	}
	
}
