package superCanard;

public class Colvert extends Canard{

	public Colvert(){
		comportementCancan = new Cancan();
		comportementVol = new VolerAvecDesAiles();
	}
	
	@Override
	public void afficher() {
		System.out.print("Je suis un colvert");
		
	}

}
