package MojaAbstrakcyjna;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KlasaA klasaA = new KlasaA();
		MojInterfejs klasaB = klasaA.zwrocKlaseB();
		MojInterfejs klasaC = klasaA.abstrakcyjnaC();

		
		klasaB.napis();

		klasaC.napis();
	}

}
