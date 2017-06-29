package superCanard;

public class CanardEnPlastique extends Canard{

	public CanardEnPlastique(){
		comportementCancan = new CanardMuet();
		comportementVol = new NePasVoler();
	}
	
	@Override
	public void afficher() {
		System.out.print("Je suis un canard en plastique");
		
	}

}
