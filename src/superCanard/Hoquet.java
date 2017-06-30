package superCanard;

public class Hoquet implements ComportementCancan{
	private ComportementCancan cc1;
	private ComportementCancan cc2;
	boolean hoquet = false;
		
	public Hoquet(ComportementCancan cc1, ComportementCancan cc2) {
		super();
		this.cc1 = cc1;
		this.cc2 = cc2;
	}

	@Override
	public void cancaner() {
		if (hoquet){
			cc1.cancaner();
		} else {
			cc2.cancaner();
		}
		hoquet = ! hoquet;
		
		
	}
	
	public static void main(String[] args) {
		
		Hoquet hoquet2 = new Hoquet(new CanardMuet(), new Hoquet(new Coincoin(), new Cancan()));
		hoquet2.cancaner();
		hoquet2.cancaner();
		hoquet2.cancaner();
		hoquet2.cancaner();

	}

}
