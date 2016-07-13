
public class KlasaA {

	private class KlasaC implements IKlasy {

		@Override
		public void wyswietlNapis() {
		  System.out.println("KlasaC wewnatrz KlasyA");
		}
	}
	
	public IKlasy zwrocInstancjeKlasyC(){
		return new KlasaC();
	}
	
	public IKlasy zwrocInstancjeKlasyB(){
		return new KlasaB(){
			@Override
			public void wyswietlNapis() {
			  System.out.println("KlasaB wewnatrz KlasyA");
			  
			}
		};
	}
}
