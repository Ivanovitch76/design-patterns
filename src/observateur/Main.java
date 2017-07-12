package observateur;

public class Main {

	public static void main(String[] args) {
		Garage garage = new Garage();
		Camion c1 = new Camion("ZEA251");
		Camion c2 = new Camion("GEO362");
		Camion c3 = new Camion("GAF741");
		
		ServiceNettoyage nettoyage = new ServiceNettoyage();
		Comptabilite comptabilite = new Comptabilite();
		
		garage.addObserver(nettoyage);
		garage.addObserver(comptabilite);		
		
		garage.add(c1);
		garage.add(c2);
		garage.add(c3);
	}

}
