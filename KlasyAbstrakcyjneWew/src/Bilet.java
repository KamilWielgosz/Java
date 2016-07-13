public abstract class Bilet{

	String przystanek;
	private double cena;
	  
    public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public abstract void DrukujBilet();
	public abstract void Reszta();
	public abstract void DodajPieniadz(Pieniadz p);

}
