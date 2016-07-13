package gui;

public class Test {

	public static void main(String[] args) {
		
		Stos s = new Stos();
		
		s.push("a");
		s.push("b");
		
		System.out.println(s.top());

	}

}
