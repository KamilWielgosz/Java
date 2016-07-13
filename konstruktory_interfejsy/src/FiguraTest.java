
public class FiguraTest {

	public static void main(String[] args) {
		
		Kolo kolo = new Kolo();
		Kolo kolo2 = new Kolo(50);
		Prostokat prostokat = new Prostokat();
        Prostokat prostokat2 = new Prostokat(3,7,"Bezowy",true);
		
 	   Figura[] figury = new Figura[4];	
 	   figury[0] = kolo;
 	   figury[1] = kolo2;
 	   figury[2] = prostokat;
 	   figury[3] = prostokat2;

 	   for(int i = 0; i < figury.length; i++){
 		   
 		   System.out.println(figury[i].obliczObwod());
 		  // figury[i].draw();
 	   }
 	  
//		for(int i = 0; i < figury.length; i++){
//			if(figury[i] instanceof Kolo){
//				System.out.println(((Kolo) figury[i]).obliczPole());	
//			} else if(figury[i] instanceof Prostokat){
//				System.out.println(((Prostokat) figury[i]).obliczPole());
//			}
//		}
			
		
	}

}
