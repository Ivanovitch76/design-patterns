package observateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Garage extends Observable {

	private List<Camion> list = new ArrayList<>();

	public boolean add(Camion e) {
		System.out.println("Garage.add()");
		boolean added = list.add(e);
		this.setChanged();
		this.notifyObservers(e);
		return added;
	}
	
	
}
