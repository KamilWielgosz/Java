package MojaAbstrakcyjna;

public class KlasaA {
	
	private class KlasaB implements MojInterfejs{

		@Override
		public void napis() {
			System.out.println("W klasie B");
			
		}
		
	}
	
	public MojInterfejs zwrocKlaseB(){
		return new KlasaB();
	}
	
	
	public MojInterfejs abstrakcyjnaC(){
		return new KlasaC(){
			    
			@Override
			public void napis() {
				System.out.println("W klasie abstrakcyjenj");
				
			}
			
		};
	}
	

	

}
