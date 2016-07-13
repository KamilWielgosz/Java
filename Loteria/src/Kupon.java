import java.util.LinkedList;
import java.util.Random;

public class Kupon
{

	String nazwaKuponu = new String();
	int ileSztuk;
	double cena;
	double suma;
	int tabWylosowane[] = new int[6];
	int trafione = 0;
	Loteria loteria;
	double wygrana;
	
	LinkedList m1 = new LinkedList();
	Random generator1 = new Random();

	void dodajLoterie(Loteria l){
		loteria = l;
	}
	

	Kupon(String nazwa, int ile, double cena)
	{
		nazwaKuponu=nazwa;
		ileSztuk=ile;
		this.cena=cena;
	}
	
	void losuj(){
		 
		for(int i=1; i<25; i++) {
		 
		   m1.add(i);
		}
		
		for(int i = 0; i < 6; i++){
			//System.out.println(m.get(i));
			int b = generator1.nextInt(20 - i);			
			tabWylosowane[i] = (int)m1.get(b);	
			
			m1.remove(b);
		}
		
		
	}
	
	
	void sprawdzWygrana(){
		
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				if(loteria.tab[i] == tabWylosowane[j]){
					trafione++;
				}
			}
		}
		
		switch(trafione){
		case 0: wygrana = 0.0;
		        break;
		case 1: wygrana = 0.0;
		        break;
		case 2: wygrana = 0.0;
		        break;
		case 3: wygrana = 24.0;
		        break;
		case 4: wygrana = 100.0;
		        break;
		case 5: wygrana = 5000.0;
		        break;
		case 6: wygrana = 6000000.0;
		        break;
		        
		}
		
	}
	

	void obliczWartosc()
	{
		suma=ileSztuk*cena;	
	}

	public String toString()
	{
		String wyjscie=new String();
		wyjscie = ("\n"+nazwaKuponu+" "+cena+" zl "+ileSztuk+"szt. razem "+suma+" zl TRAFIONE: " + trafione + " WYGRALES: " + wygrana + " zl");
		return wyjscie;
	}
	
}
