package interfacee;

public class CriterePrix implements Critere{
	private int prix;
	public CriterePrix(int prix) {
		this.prix=prix;
	}
	
	public boolean estSatisfaitPar(Voiture v) {
		return v.getLocation()<this.prix;
	}

}
