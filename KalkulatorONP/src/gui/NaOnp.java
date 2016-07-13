package gui;

public class NaOnp {

	public int[] tab_stos = new int[20];
	public int licznik_stosu = 0;

	public String zachowaj = new String();
	public String zachowaj1 = new String();

	public String[] tab_onp = new String[20];
	public int licznik_onp = 0;

	public int otwarty = 0;

	public int dwa_razy = 0;
    public int bylo = 0;
	public String funkcjaOnp(String[] a) {
		zachowaj = "0";
		zachowaj1 = "0";
         
			for (int i = 0; i < a[0].length() - 1; i++) {
				String wart = a[0].charAt(i) + "";
				//System.out.println(wart);
				
				if(wart.equals("(")){
					wart = a[0].charAt(++i) + "";
					while(!wart.equals(")")){
						
						switch(wart){
						
						  case "+": zachowaj = wart;
						            break;
						         
						  case "-": zachowaj = wart;
						            break;
						            
						  case "*": zachowaj = wart;
						            break;
						            
						  case "/": zachowaj = wart;
						            break;
						            
						  case "^": zachowaj = wart;
						            break;
						            
						  default: tab_onp[licznik_onp++] = wart;
						           dwa_razy++;
						}
						
						
						wart = a[0].charAt(++i) + "";
						
						if(wart.equals(".")){
							wart = a[0].charAt(++i) + "";
							tab_onp[licznik_onp-1] = tab_onp[licznik_onp-1] + "." + wart;
							wart = a[0].charAt(++i) + "";
						}
						
						if(dwa_razy == 2){
							
							tab_onp[licznik_onp++] = zachowaj;
							dwa_razy = 1;
						}
					} //while
					
					if(!zachowaj1.equals("0")){
						
						tab_onp[licznik_onp++] = zachowaj1;
						zachowaj1 = "0";
					}
					
					
					wart = a[0].charAt(++i) + "";
					dwa_razy = 0;
					
				} //wart.equals
				
				
				switch(wart){
				
				  case "+": zachowaj1 = wart;
				            break;
				         
				  case "-": zachowaj1 = wart;
				            break;
				            
				  case "*": zachowaj1 = wart;
				            break;
				            
				  case "/": zachowaj1 = wart;
				            break;
				            
				  case "^": zachowaj1 = wart;
				            break;
				            
				  default: tab_onp[licznik_onp++] = wart;
				           bylo = 1;
				}
				
				if((wart = a[0].charAt(++i) + "").equals(".")){
					wart = a[0].charAt(++i) + "";
					tab_onp[licznik_onp-1] = tab_onp[licznik_onp-1] + "." + wart;
				} else {
					wart = a[0].charAt(--i) + "";
				}
				
				if(bylo == 1 && !zachowaj1.equals("0")){
					tab_onp[licznik_onp++] = zachowaj1;
					bylo = 0;
					zachowaj1 = "0";
				}
												
			}
		
		

		
		Stos MojStos = new Stos();
		
	    double ZmiennaPop1 = 0.0;
	    double ZmiennaPop2 = 0.0;
		
		for(int m = 0; m < licznik_onp; m++){
			
			switch(tab_onp[m]){
			
			  case "+": ZmiennaPop1 = Double.parseDouble(MojStos.pop());
			            ZmiennaPop2 = Double.parseDouble(MojStos.pop());
			            ZmiennaPop2 += ZmiennaPop1;
			            MojStos.push(ZmiennaPop2 + "");		            
			            break;
			         
			  case "-": ZmiennaPop1 = Double.parseDouble(MojStos.pop());
	                    ZmiennaPop2 = Double.parseDouble(MojStos.pop());
	                    ZmiennaPop2 -= ZmiennaPop1;
	                    MojStos.push(ZmiennaPop2 + "");		  
			            break;
			            
			  case "*": ZmiennaPop1 = Double.parseDouble(MojStos.pop());
	                    ZmiennaPop2 = Double.parseDouble(MojStos.pop());
	                    ZmiennaPop2 *= ZmiennaPop1;
	                    MojStos.push(ZmiennaPop2 + "");		  			   
			            break;
			            
			  case "/": ZmiennaPop1 = Double.parseDouble(MojStos.pop());
	                    ZmiennaPop2 = Double.parseDouble(MojStos.pop());
	                    ZmiennaPop2 /= ZmiennaPop1;
	                    MojStos.push(ZmiennaPop2 + "");		  
			            break;
			            
			  case "^": ZmiennaPop1 = Double.parseDouble(MojStos.pop());
	                    ZmiennaPop2 = Double.parseDouble(MojStos.pop());
	                    ZmiennaPop2 = Math.pow(ZmiennaPop2, ZmiennaPop1);                    
	                    MojStos.push(ZmiennaPop2 + "");		  
			            break;
			            
			  default: MojStos.push(tab_onp[m]);
			}
		}
		
		return MojStos.pop();
		
	} //main
} //Class NaOnp
