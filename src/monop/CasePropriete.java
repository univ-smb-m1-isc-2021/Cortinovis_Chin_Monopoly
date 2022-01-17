package monop;

public class CasePropriete extends Case {

	public CasePropriete(String nom, int cout, int prixMaison, Quartier q) {
		super(nom, cout, prixMaison);
		this.cout = cout;
		this.prixMaison = prixMaison;
		nbMaison = 0;
		quartier = q;
		etat = 0;
		loyer = 50;
		j = new Joueur("init");
	}

	public int prixMaison;

	public int nbMaison;

	public int etat;

	public Joueur j;

	public int loyer;

	public Quartier quartier;

	public boolean SoldeSuffisant(final Joueur joueur, final int Prix) {
		if (joueur.argentJ > Prix) {
			return true;
		} else {
			return false;
		}
	}

	public int GetPrix() {
		return prixachat;
	}

	public int GetLoyer() {
		return loyer;
	}

	public boolean EstProprio(Joueur joueur) {
		if (j == joueur) {
			return true;
		} else {
			return false;
		}
	}

	public Joueur GetProprio() {
		return j;
	}

	public void setProprio(Joueur j) {
		this.j = j;
	}
}
