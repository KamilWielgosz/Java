import java.util.Date;

/*
 * Wykorzystanie interfejsu. Tutaj mo¿na równie¿ dodaæ kolejne interfejsy po przecinku (wielodziedziczenie)
 */

public class BiletomatTramwaj implements Biletomat {
	
	String lokalizacja;
	int nrBiletu;
	Bilet bilet[] = new Bilet[100];
	int indexBiletu;
	int indexPieniadz;
	double dochod;
	double reszta;
	
	
	/*
	 * Mogê sobie w taki sposob wykorzystaæ klasê wewnêtrzn¹
	 */
	class BiletomatTramwajPospieszny {
		
	}
	

	/*
	 *  Mozemy wykorzystaæ równie¿ klasê anonimow¹
	 */
	 
	public BiletomatAutobus zworcAtuobus(){
		
		return new BiletomatAutobus();
	}
	
	
	
	public BiletomatTramwaj(String lok){
		lokalizacja = lok;
	}


	@Override
	public void DodajBilet(Bilet b) {
		  bilet[indexBiletu++] = b;
	}




	@Override
	public void DodajPieniadz(Pieniadz p) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double ObliczDochod() {
		for(int i = 0; i < indexBiletu; i++){
			dochod = dochod + bilet[i].getCena();
		}
		
		return dochod;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see Biletomat#DrukujBilet()
	 * Tutaj wykorzystujemy polimorfizm, gdy¿ wpisujemy do tablicy typu 'Bilet', albo BiletNormalny albo BiletUlgowy a interpretator sam wie któr¹ metodê wykonaæ
	 * czy t¹ z klasy BiletUlgowy czy z BiletNormalny
	 */
	@Override
	public void DrukujBilet() {
		bilet[indexBiletu-1].DrukujBilet();
		
		
		
	}
	  
	public  String toString(){		
		  return "Data: "+ new Date() +"\nliczba biletow: "+ indexBiletu +", dochod: " + ObliczDochod(); 
	  }
	
	
	public static void main(String[] args) {

		
		BiletomatTramwaj btramwaj = new BiletomatTramwaj("Dworzec Glowny");
		
		BiletUlgowy biletulgowy = new BiletUlgowy(1.40, "Plac Inwalidow");	
		btramwaj.DodajBilet(biletulgowy);	
		Pieniadz pieniadz1 = new Pieniadz("Monety", 5);
		biletulgowy.DodajPieniadz(pieniadz1);
		biletulgowy.Reszta();
		btramwaj.DrukujBilet();
		
		BiletNormalny biletnormalny = new BiletNormalny(2.80, "Krowodrza Gorka");
		btramwaj.DodajBilet(biletnormalny);
		Pieniadz pieniadz2 = new Pieniadz("Monety", 8);
		biletnormalny.DodajPieniadz(pieniadz2);
		biletnormalny.Reszta();
		btramwaj.DrukujBilet();
		
		BiletNormalny biletnormalny1 = new BiletNormalny(2.80, "Rondo Mogilskie");
		btramwaj.DodajBilet(biletnormalny1);
		Pieniadz pieniadz3 = new Pieniadz("Monety", 5);
		biletnormalny1.DodajPieniadz(pieniadz3);
		biletnormalny1.Reszta();
		btramwaj.DrukujBilet();
		
		
		/*
		 * W taki sposob tworzymy instancje klasy wewnetrznej
		 */
		BiletomatTramwaj.BiletomatTramwajPospieszny  ptramwaj = btramwaj.new BiletomatTramwajPospieszny();
		
		
		
		System.out.println(btramwaj);

	}



}
