package monop;

public class Service extends CasePropriete {

	int loyer = 15;

	public Service(String nom, int cout, int prixMaison, Quartier q) {
		super(nom, cout, prixMaison, q);
	}

	public void doitPayerA(final int total, final Joueur joueur) {
	}

	public int calculLoyer(Joueur j) {
		int mult = 4;
			//a ne pas faire
		int r = lancerdeService();
		System.out.println("Le loyer est de : 20 * : " + mult + " * et * le loyer de : " + r);
		return loyer * mult * r;
	}

	public int lancerdeService() {
		return (int) (Math.random() * 12);
	}

}
