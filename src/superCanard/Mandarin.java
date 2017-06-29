package superCanard;

public class Mandarin extends Canard {

	public Mandarin(){
		comportementCancan = new Coincoin();
		comportementVol = new VolerAvecDesAiles();
	}
	
	@Override
	public void afficher() {
		System.out.print("Je suis un mandarin");
		
	}

}
