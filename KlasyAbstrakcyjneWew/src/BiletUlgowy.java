/*
 * 
 *  KLasa dziedziczy po klasie abstrakcyjnej Bilet, przez co musi mieæ nadpisane wszystkie metody z klasy abstrakcyjnej
 */
public class BiletUlgowy extends Bilet {

	String przystanek;
	private double cena;
	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}


	double reszta;
	Pieniadz pieniadz;

	public BiletUlgowy(double c, String p) {
		
		cena = c;
		przystanek = p;
	}
	
	@Override
	public void Reszta() {

		reszta =  pieniadz.cena - cena;
	}
	
	@Override
	public void DodajPieniadz(Pieniadz p) {
		pieniadz = p;
		
	}


	@Override
	public void DrukujBilet() {
		System.out.println("Bilet ulgowy");
		System.out.println("Przystanek: " + przystanek);
		System.out.println("Reszta: " + reszta);
		System.out.println("*************************");
		
	}



}
