package monop;

public class Gare extends CasePropriete {

	int etat = -1;
	int loyer;

	public Gare(String nom, int cout, int prixMaison, Quartier q) {
		super(nom, cout, prixMaison, q);
		loyer = 50;
	}

	public int nbGarePossede(Joueur joueur) {
		return joueur.nbGare;
	}

	public int calculLoyerGare(Joueur joueur) {
		return joueur.nbGare * loyer;
	}

}
