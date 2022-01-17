package monop;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
	public List<Case> listeCases;
	public int de_pipe[];
	public int de;
	public Object liste;

	public Plateau() {
		listeCases = new ArrayList<Case>();
	}

	public void creationCase() {

		// Création des quartiers
		Quartier q1 = new Quartier("Marron", 2);
		Quartier q2 = new Quartier("BleuClair", 3);
		Quartier q3 = new Quartier("Rose", 3);
		Quartier q4 = new Quartier("Orange", 3);
		Quartier q5 = new Quartier("Rouge", 3);
		Quartier q6 = new Quartier("Jaune", 3);
		Quartier q7 = new Quartier("Vert", 3);
		Quartier q8 = new Quartier("Bleu", 2);
		Quartier service = new Quartier("Service", 2);
		Quartier gare = new Quartier("gare", 4);

		// Cases Spéciales hors rues
		Case depart = new Case("Départ", 0,0);
		Case taxe1 = new Case("Impôts sur le revenu", 0,0);
		Case prison = new Case("Allez en Prison", 0,0);
		Case visitePrison = new Case("Prison", 0,0);
		Case parcGratuit = new Case("Parc Gratuit", 0,0);
		Service energie1 = new Service("Compagnie électrique", 150, 0, service);
		Service energie2 = new Service("Service des eaux", 150, 0, service);
		Case taxe2 = new Case("Taxe de luxe", 100,0);

		Gare gare1 = new Gare("Gare Montparnasse", 200, 0, gare);
		Gare gare2 = new Gare("Gare Lyon", 200, 0, gare);
		Gare gare3 = new Gare("Gare Nord", 200, 0, gare);
		Gare gare4 = new Gare("Gare Saint-Lazare", 200, 0, gare);

		// Cases de type rue
		CasePropriete marron1 = new CasePropriete("Boulevard de belleville", 60, 100, q1);
		CasePropriete marron2 = new CasePropriete("Rue Lecourbe", 60, 100, q1);

		CasePropriete bleuClair1 = new CasePropriete("Rue Vaugirard", 100, 150, q2);
		CasePropriete bleuClair2 = new CasePropriete("Rue de Courcelles", 100, 150, q2);
		CasePropriete bleuClair3 = new CasePropriete("Avenue de la République", 120, 150, q2);

		CasePropriete rose1 = new CasePropriete("Boulevard de la Villette", 140, 200, q3);
		CasePropriete rose2 = new CasePropriete("Avenue de Neuilly", 140, 200, q3);
		CasePropriete rose3 = new CasePropriete("Rue du paradis", 160, 200, q3);

		CasePropriete orange1 = new CasePropriete("Avenue de Mozart", 180, 250, q4);
		CasePropriete orange2 = new CasePropriete("Rue de Courcour", 180, 250, q4);
		CasePropriete orange3 = new CasePropriete("Avenue de la République", 200, 250, q4);

		CasePropriete rouge1 = new CasePropriete("Avenue de Matignon", 220, 300, q5);
		CasePropriete rouge2 = new CasePropriete("Rue de Courcelles", 220, 300, q5);
		CasePropriete rouge3 = new CasePropriete("Avenue de la République", 240, 300, q5);

		CasePropriete jaune1 = new CasePropriete("Faubourd Saint-Honoré", 260, 350, q6);
		CasePropriete jaune2 = new CasePropriete("Place de la bourse", 260, 350, q6);
		CasePropriete jaune3 = new CasePropriete("Rue la fayette", 280, 350, q6);

		CasePropriete vert1 = new CasePropriete("Avenue de breteuil", 300, 400, q7);
		CasePropriete vert2 = new CasePropriete("Avenue Fosch", 300, 400, q7);
		CasePropriete vert3 = new CasePropriete("Boulevard des capucines", 320, 400, q7);

		CasePropriete bleu1 = new CasePropriete("Avenue des champs-élysée", 300, 400, q8);
		CasePropriete bleu2 = new CasePropriete("Rue de la paix", 320, 400, q8);

		// On ajoute chaque case à la liste des cases du plateau.
		listeCases.add(depart);
		listeCases.add(marron1);
		listeCases.add(marron2);
		listeCases.add(taxe1);
		listeCases.add(bleu1);
		listeCases.add(bleu2);
		listeCases.add(gare1);
		listeCases.add(bleuClair1);
		listeCases.add(bleuClair2);
		listeCases.add(bleuClair3);
		listeCases.add(visitePrison);
		listeCases.add(rose1);
		listeCases.add(energie1);
		listeCases.add(rose2);
		listeCases.add(rose3);
		listeCases.add(gare2);
		listeCases.add(orange1);
		listeCases.add(orange2);
		listeCases.add(orange3);
		listeCases.add(parcGratuit);
		listeCases.add(rouge1);
		listeCases.add(rouge2);
		listeCases.add(rouge3);
		listeCases.add(gare3);
		listeCases.add(jaune1);
		listeCases.add(jaune2);
		listeCases.add(energie2);
		listeCases.add(jaune3);
		listeCases.add(prison);
		listeCases.add(vert1);
		listeCases.add(vert2);
		listeCases.add(vert3);
		listeCases.add(gare4);
		listeCases.add(taxe2);
		

	}
}