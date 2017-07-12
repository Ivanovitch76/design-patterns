package observateur;

import java.util.Observable;
import java.util.Observer;

public class ServiceNettoyage implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("ServiceNettoyage.update()");
		System.out.println(o);
		System.out.println(arg);
	}

}
