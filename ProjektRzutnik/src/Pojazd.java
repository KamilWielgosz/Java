

public class Pojazd {
	
	private int maxPredkosc;
	int k = 5;
	private UkladSterowania us = new UkladSterowania();
	
	public Pojazd(int x){
		maxPredkosc = x;
		System.out.println("Pojazd()");
		wLewo();
	}

	public int getMaxPredkosc() {
		return maxPredkosc;
	}

	public void setMaxPredkosc(int maxPredkosc) {
		this.maxPredkosc = maxPredkosc;
	}
	
	
	public void jedz(){
		System.out.println("Pojazd jedzie");
	}

	public void doPrzodu() {
		us.doPrzodu();
	}

	public void doTylu() {
		us.doTylu();
	}

	public void wLewo() {
		us.wLewo();
		System.out.println(k);
	}

	public void wPrawo() {
		us.wPrawo();
	}
	

}
