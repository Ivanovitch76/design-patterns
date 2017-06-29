package superCanard;

import java.util.ArrayList;

public class SuperCanard {

	public static void main(String[] args) {
		 int i = 1;
		 boolean hoquet = false;
		
		 System.out.println("PAN PAN"); 
		 ArrayList <Canard> Canards = new ArrayList<Canard>(); 
		 Canards.add(new Mandarin()); 
		 Canards.add(new Colvert()); 
		 Canards.add(new Leurre()); 
		 Canards.add(new CanardEnPlastique());

		 for( Canard canardo : Canards){ 
			 canardo.afficher(); 
			 while (i<=5){
				 if (i % 2 == 0){
					 hoquet = true;
				 }
				 canardo.effectuerCancan(hoquet); 
				 i++;
			 }	 
			 
			 
			 canardo.effectuerVol(); 
		}
		
	}

}
