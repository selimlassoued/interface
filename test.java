package interfacee;

public class test {
	
	public static void main(String[] args) {
		Agence Ag=new Agence(8);
		Voiture v=new Voiture("Porshe","Panamera",2022,6000);
		Voiture v1=new Voiture("Mercedes","GLS",2020,10000);
		Voiture v2=new Voiture("BMW","x6",2024,8000);
		Voiture v3=new Voiture("Mercedes","CLE",2023,6000);
		Ag.ajout(v);
		Ag.ajout(v1);
		Ag.ajout(v2);
		Ag.ajout(v3);

		CritereMarque cri=new CritereMarque("BMW");
		CriterePrix cri1=new CriterePrix(7000);
		Ag.afficheSelection(cri);
		Ag.afficheSelection(cri1);
		
	}

}
