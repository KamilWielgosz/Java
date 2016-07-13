public class Paragon {
	
	int ileDodanych;
	int maksymalnyRozmiar;
	double suma = 0;
	
	Pozycja[] pozycja;
	
	public Paragon(){
		this.maksymalnyRozmiar = 10;
		this.ileDodanych = 0;
	}
	
	public Paragon(int wartosc){
		this.maksymalnyRozmiar = 10;
		this.pozycja = new Pozycja[wartosc];
		System.out.println("Maksynalna liczba pozycji na paragonie: " + maksymalnyRozmiar);
		
	}
	
	
	public void dodajPozycje(Pozycja p){
		
		pozycja[ileDodanych++] = p;
		
	}
	
	public void obliczWartosc(){
		
		for(int i = 0; i < pozycja.length; i++){		
			suma = suma + pozycja[i].wartoscWszystkich;
		}
		
	}
	
	public String toString(){
		
		return "Dane sklepu: Zabka  pozycje: " + ileDodanych +" suma: "+ suma + " data i odzina: nr urzadzenia: " ;
		
	}


}
