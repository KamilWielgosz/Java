package procesor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Task implements Comparable<Task>{
	
	private String nazwaAplikacji;
	private int czas_start;
	private int rozmiarZadania;
	private int deadLine;
	
	Task(String nazwaAplikacji, int czas_start,int rozmiarZadania, int deadLine){
		this.nazwaAplikacji = nazwaAplikacji;
		this.czas_start = czas_start;
		this.rozmiarZadania = rozmiarZadania;
		this.deadLine = deadLine;
	}

	public String getNazwaAplikacji() {
		return nazwaAplikacji;
	}

	public void setNazwaAplikacji(String nazwaAplikacji) {
		this.nazwaAplikacji = nazwaAplikacji;
	}

	public int getCzas_start() {
		return czas_start;
	}


	public void setCzas_start(int czas_start) {
		this.czas_start = czas_start;
	}

	public int getDeadLine() {
		return deadLine;
	}


	public void setDeadLine(int deadLine) {
		this.deadLine = deadLine;
	}




	@Override
	public String toString() {
		return "Comp [nazwaAplikacji=" + nazwaAplikacji + ", czas_start=" + czas_start + ", rozmiarZadania="
				+ rozmiarZadania + ", deadLine=" + deadLine + "]";
	}

	@Override
	public int compareTo(Task other) {
		if(other.czas_start < this.czas_start){
			return 1;
		} else if(other.czas_start > this.czas_start){
			return -1;
		} else {
			return 0;
		}
	}
	
}


public class Resource<T> {
	private ArrayList<T> linkd = new ArrayList<T>();

	public void dodaj(T obiekt){
        int j = 0;
        
        if(obiekt instanceof Comparable)
        {
            while(j < linkd.size() && (((Comparable)obiekt).compareTo(linkd.get(j)) > 0))
            {
                j++;
            }
            linkd.add(j, obiekt);
        }
        
	}
	
	public void pokaz(){
		System.out.println(linkd);
	}
	
	T peek(){
		return linkd.get(0);
	}
	
	T usun(){
		
		if(!linkd.isEmpty()){
			return linkd.remove(0);
		} else {
			System.out.println("Pusto");
			return null;
		}
	}
	
	boolean empty(){
		if(linkd.isEmpty()){
			return true;
		} else {
			return false;
		}
	}
	
	public static String translate(String msg){
		Map<String, String> myMap = new HashMap<String, String>();		
		
		myMap.put("Przekroczono DeadLine", "Exceed DeadLine");
		
		return myMap.get(msg);
	}
	
	public static void PrzekroczenieDeadLine() throws MyException{
		   System.out.println("Wyrzucam wyjatek MyException z PrzekroczenieDeadLine()");
		   throw new MyException("Przekroczono DeadLine");
	}
	public static void main(String[] args) {
		Resource<Task> kp = new Resource<Task>();
		Random generator = new Random();

		int mocProcesora = 8;
		int czas_start = 0;
		int deadLine = 0;
		int rozmiarZadania = 0;
		boolean czyJeden = true;
		
		String proces = "Proces ";
		String ProcesTekst;
		
		int j = 0;
		
		do{
		try {
			mocProcesora = generator.nextInt(7)+1;
			deadLine = 2;
			rozmiarZadania = 2;
			ProcesTekst = proces + j;
			j++;
			czas_start = rozmiarZadania/mocProcesora;
			
			if(czas_start < deadLine){
			
			kp.dodaj(new Task(ProcesTekst, czas_start,rozmiarZadania,deadLine));
			czyJeden = false;
			} else {
				System.out.println(translate("Przekroczono DeadLine"));		
				PrzekroczenieDeadLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		} while(czyJeden);
		
		
		//kp.pokaz();
		//System.out.println(kp.peek());
		
		
		
		
		
		while(!kp.empty()){
			System.out.println(kp.usun());
		}
	}

}