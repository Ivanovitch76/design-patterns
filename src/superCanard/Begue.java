package superCanard;

public class Begue implements ComportementCancan{
	private ComportementCancan cc1;

	
	public Begue(ComportementCancan cc1) {
		super();
		this.cc1 = cc1;
	}

	@Override
	public void cancaner() {
		int i = 1;
		while (i <= 2){
			cc1.cancaner();
			i++;
		}
		
		
	}

	public static void main(String[] args) {
		
		Begue begue = new Begue(new Coincoin());
		begue.cancaner();

	}
	
}
