package monop;

import java.util.ArrayList;
import java.util.List;

public class Partie {
	public int tour;

	public Plateau p;

	public List<Joueur> liste;

	public Object pl;

	public Partie() {
		liste = new ArrayList<Joueur>();
	}

	public void connexion(String nom) {

		liste.add(new Joueur(nom));
		System.out.println("Joueur : "+ nom + " connect�.");
	}

	public Joueur passesonTour() {

		System.out.println("#-----  Fin de tour  -----#\n");
		tour++;
		if (tour >= liste.size()) {
			tour = 0;
		}
		return liste.get(tour);
	}

	public Plateau getPlateau() {
		return p;
	}

	public Joueur lancerPartie() {

		tour = 0;

		p = new Plateau();

		p.creationCase();

		for (int i = 0; i < liste.size(); i++) {

			liste.get(i).setCaseC(p.listeCases.get(0));
		}
		return liste.get(tour);
	}

}