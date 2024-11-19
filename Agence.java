package interfacee;

public class Agence {
	Voiture[] Voitures;
	int nbrV;
	public static int incre=0;
	public Agence(int nbrV) {
		this.nbrV=nbrV;
		Voitures=new Voiture[nbrV];
	}
	public void afficheSelection(Critere c)
	{
		for(int i=0;i<incre;i++)
		{
			if(c.estSatisfaitPar(Voitures[i])) {
				System.out.println(Voitures[i]);
			}
		}
	}
	public void ajout(Voiture v)
	{
		if(incre<nbrV)
		{
			Voitures[incre]=v;
			incre++;
		}
	}
	
	

}
