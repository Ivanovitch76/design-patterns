package superCanard;

public class CriFactory {

	public ComportementCancan getCancan() {
		return new Coincoin();
	}
	
	public ComportementCancan getMuet() {
		return new CanardMuet();
	}
	
	public ComportementCancan get2(ComportementCancan c) {
		return new Begue(c);
	}
	
	public ComportementCancan get2Cancan() {
		return get2(getCancan());
	}

	public ComportementCancan get2Muet() {
		return get2(getMuet());
	}
	
	public ComportementCancan getHoquet() {
		return new Hoquet(new CanardMuet(), new Hoquet(new Coincoin(), new Cancan()));
//		return new Hoquet(new CanardMuet(), new Coincoin());
	}
	
	public ComportementCancan getBegue() {
		return new Begue(new CanardMuet());
	}
	
	
	public ComportementCancan get4(ComportementCancan c4) {
		return get2(get2(c4));
	}
	
	public ComportementCancan get4Cancan() {
		return get4(getCancan());
	}
	
}
