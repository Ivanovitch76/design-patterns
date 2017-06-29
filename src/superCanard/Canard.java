package superCanard;

public abstract class Canard {	
	
	ComportementCancan comportementCancan;
	ComportementVol comportementVol;
	
	public Canard(){}
	
	public void nager(){
				
	}

	public abstract void afficher();
		
	public void effectuerCancan(boolean hoquet){
		comportementCancan.cancaner(); 
	}
	public void effectuerVol(){
		comportementVol.voler();
	}
	public void setComportementVol(ComportementVol cv){
		this.comportementVol = cv;
	}	
	public void setComportementCancan(ComportementCancan cc){
		this.comportementCancan = cc;
	}

}
