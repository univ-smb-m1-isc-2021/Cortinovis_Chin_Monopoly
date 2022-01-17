package monop;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
	public String nom;
	public int argentJ;
	public Case kase;
	public int nbGare;
	public List<CasePropriete> l;

	public Joueur(String nom) {
		l = new ArrayList<CasePropriete>();
		this.nom = nom;
		this.argentJ = 2000;
		this.nbGare = 0;
	}

	public void AcheterBien() {
		CasePropriete c = (CasePropriete) kase;

		if (c.etat != 0) {
			System.out.println("Ce bien n'est pas en vente, il appartient deja a : " + c.j.nom + " \n");
		} else {
			if (c.prixachat < this.argentJ) {
				l.add(c);
				DebiteSolde(c.prixachat);
				c.j = this;
				c.etat = 1;
				kase.etat = 1;
				System.out.println("Achat réussi pour : " + c.nom + "\n");
				System.out.println("Vos possessions : " + "\n");

				if(getQuartier(c.quartier)){
					c.etat = 2;
					kase.etat = 2;
					System.out.println("Vous possedez tous le quartier \n");
				}

				for (int i = 0; i < l.size(); i++) {
					System.out.println(l.get(i).nom + "\n");
				}

				System.out.println("Votre solde  " + this.argentJ + "\n");
			} else {
				System.out.println("Achat non-réussi pour : " + c.nom + " solde insufisant ! \n");
			}
		}

	}

	public void setCaseC(Case kase) {
		this.kase = kase;
	}

	public Case getCaseC() {
		return this.kase;
	}

	public boolean getQuartier(Quartier q) {
		int nb = 0;
		for (int i = 0; i < l.size(); i++) {

			if (l.get(i).quartier.Couleur != null && l.get(i).quartier.Couleur.equals(q.Couleur)) {
				nb += 1;
			}

			if (q.nbrue == nb) {
				return true;
			}
		}
		return false;
	}

	public void ConstruireMaison(Case k) {

		CasePropriete c = (CasePropriete) kase;
			if (c.prixMaison <= this.argentJ && k.etat == 2)  {
				DebiteSolde(c.prixMaison);
			
				c.nbMaison += 1;
				c.loyer = 100*c.nbMaison;

				System.out.println("Achat de maison réussi pour : " + c.nom + " , le loyer est maintenant de : " + c.loyer);

				System.out.println("Votre solde  " + this.argentJ + "\n");
			} else {
				if(k.etat != 2){
					System.out.println("Achat non-réussi de maison pour : " + c.nom + " , le quartier n'est pas encore à vous ! \n");
				}
				else{
					
					System.out.println("Achat non-réussi de maison pour : " + c.nom + " solde insufisant ! \n");
				}
			}
		}

		
	

	public void DebiteSolde(int prix) {
		argentJ -= prix;
	}

	public void AjouteSolde(int prix) {
		argentJ += prix;
	}

}
