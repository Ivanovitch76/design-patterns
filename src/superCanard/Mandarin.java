package superCanard;

public class Mandarin extends Canard {

	public Mandarin(){
		comportementCancan = new Coincoin();
//		comportementCancan = new Hoquet();
		comportementVol = new VolerAvecDesAiles();
	}
	
	@Override
	public void afficher() {
		System.out.print("Je suis un mandarin");
		
	}

}
