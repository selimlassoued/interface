package interfacee;

public class Voiture {
	private String marque;
	private String modele;
	private int prodannee;
	private int location;
	public Voiture(String marque,String modele,int prodannee,int location) {
		this.marque=marque;
		this.location=location;
		this.modele=modele;
		this.prodannee=prodannee;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getProdannee() {
		return prodannee;
	}
	public void setProdannee(int prodannee) {
		this.prodannee = prodannee;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", prodannee=" + prodannee + ", location="
				+ location + "]";
	}
	
	

}
