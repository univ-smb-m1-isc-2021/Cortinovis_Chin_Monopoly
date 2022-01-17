package monop;

import java.util.Random;

public class Des {

	public int faux_de[];
	public int de;
	int max = 12;
	Random rand = new Random(); //instance of random class

	public Des() {
		de = 0;
	}

	public void lancerDeDe(Joueur j, Plateau pl) {
		Case c = j.getCaseC();
		int positionCase = pl.listeCases.indexOf(c);
	    int int_random = rand.nextInt(max+1);  //generate random values from 0-12

		int nouvellePosition = (positionCase + int_random) % pl.listeCases.size();

		System.out.println("c'est le tour de " + j.nom + " ,  avec comme lancé :  " + int_random
				+ " on arrive sur la case :  " + pl.listeCases.get(nouvellePosition).nom);
		j.kase = pl.listeCases.get(nouvellePosition);

		if (pl.listeCases.get(nouvellePosition).etat != 0) {
			CasePropriete cp = (CasePropriete) pl.listeCases.get(nouvellePosition);
			if (cp.j.nom != null && !cp.j.nom.equals(j.nom) ) {
				if (cp.GetLoyer() == 50){
					System.out.println("Vous tombez sur la case de " + cp.j.nom + " ,Vous allez payer  " + cp.GetLoyer());
				}
				else{
					System.out.println("Vous tombez sur la case de " + cp.j.nom + " ,Vous allez payer  " + cp.GetLoyer() + " car il y a : " + cp.nbMaison + " maison(s).");
				}
				j.DebiteSolde(cp.loyer);
				cp.j.AjouteSolde(cp.loyer);
				System.out.println("Votre solde est de : " + j.argentJ + " \n Le solde de  " + cp.j.nom + " est de : "
						+ cp.j.argentJ);
			}
		}
	}
	
	public void lancerDeDePipe(Joueur j, Plateau pl, int resDe) {
		Case c = j.getCaseC();
		int positionCase = pl.listeCases.indexOf(c);
		
		int nouvellePosition = (positionCase + resDe) % pl.listeCases.size();
		//System.out.println(nouvellePosition);

		System.out.println("c'est le tour de " + j.nom + " ,  avec comme lancé :  " + resDe
				+ " on arrive sur la case :  " + pl.listeCases.get(nouvellePosition).nom);
		j.kase = pl.listeCases.get(nouvellePosition);

		if (j.kase.etat != 0) {
			System.out.println("Paye test");
			CasePropriete cp = (CasePropriete) pl.listeCases.get(nouvellePosition);
			if (cp.j.nom != null && !cp.j.nom.equals(j.nom)) {
				if (cp.GetLoyer() == 50){
					System.out.println("Vous tombez sur la case de " + cp.j.nom + " ,Vous allez payer  " + cp.GetLoyer());
				}
				else{
					System.out.println("Vous tombez sur la case de " + cp.j.nom + " ,Vous allez payer  " + cp.GetLoyer() + " car il y a : " + cp.nbMaison + " maison(s).");
				}
				j.DebiteSolde(cp.loyer);
				cp.j.AjouteSolde(cp.loyer);
				System.out.println("Votre solde est de : " + j.argentJ + " \n Le solde de  " + cp.j.nom + " est de : "
						+ cp.j.argentJ);
			}
		}
	}

}
