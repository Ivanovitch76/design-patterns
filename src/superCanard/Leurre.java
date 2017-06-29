package superCanard;

public class Leurre extends Canard{

	public Leurre(){
		comportementCancan = new CanardMuet();
		comportementVol = new NePasVoler();
	}
	
	@Override
	public void afficher() {
		System.out.print("Je suis un leurre");
		
	}
	
}
