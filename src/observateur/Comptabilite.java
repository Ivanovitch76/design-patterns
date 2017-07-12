package observateur;

import java.util.Observable;
import java.util.Observer;

public class Comptabilite implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Comptabilite.update()");
		
	}

}
