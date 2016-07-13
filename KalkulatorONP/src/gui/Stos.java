package gui;

import java.util.LinkedList;

public class Stos {

	String znak;
	
	private LinkedList<String> stos = new LinkedList<String>();
	
	public void push(String z){
		stos.add(z);
	}
	
	public String pop(){
		if(stos.isEmpty()){
			System.out.println("Stos jest pusty");
			return null;
		}
		else{
			return stos.getLast();
		}
	}
	
	public String top(){
		if(stos.isEmpty()){
			System.out.println("Stos jest pusty");
			return null;
		}
		else{

			return stos.peek();
		}
	}
	
}