package monop;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Partie p = new Partie();

		boolean arret = false;
		
		int choix;
		String choixstring;
		
		
        while (!arret){
			
			System.out.println("--JEU DU MONOPOLY--");
			System.out.println("Test scénario dés pipés : tapez 1");
			System.out.println("Enregistrer un joueur : tapez 2");
			System.out.println("Lancer le jeu : tapez 3");
            System.out.println("quitter : tapez 4");
			Scanner sc = new Scanner(System.in);
			choix = sc.nextInt();

			if (choix == 1){
					
					p.connexion("Paul");
					p.connexion("Luc");
					p.connexion("Theo");
		

					System.out.println("Les joueurs jouerons dans cette ordre : ");

					for(int i = 0;i < p.liste.size();i++) {

						System.out.print( p.liste.get(i).nom + " ");
					}

					System.out.println("");
			
					Joueur c = p.lancerPartie();
			
					Plateau pl = p.getPlateau();

					Des des = new Des();
					
					// Init propri�t�s des joueurs.
					
					// Paul ach�te toutes les gares et revient � la case d�part
					des.lancerDeDePipe(c,pl,6);
					c.AcheterBien();
					des.lancerDeDePipe(c,pl,9);
					c.AcheterBien();
					des.lancerDeDePipe(c,pl,8);
					c.AcheterBien();
					des.lancerDeDePipe(c,pl,9);
					c.AcheterBien();
					des.lancerDeDePipe(c,pl,2);
					c = p.passesonTour();
					// Luc ach�te �lys�es
					des.lancerDeDePipe(c,pl,4);
					c.AcheterBien();
					c = p.passesonTour();
					// Th�o ach�te service des eaux
					des.lancerDeDePipe(c,pl,26);
					c.AcheterBien();
					des.lancerDeDePipe(c,pl,8);
					c = p.passesonTour();
					
					
					
					System.out.println("\n ############# DEBUT DE LA PARTIE ############# \n");
					
					// Paul
					des.lancerDeDePipe(c,pl,7);
					c.AcheterBien();
					c = p.passesonTour();
			
					// Luc
					des.lancerDeDePipe(c,pl,1);
					c.AcheterBien();
					// Il a du coup tout le quartier bleu mais ne construit pas
					c = p.passesonTour();
			
					//Theo
					des.lancerDeDePipe(c, pl, 5);
					c = p.passesonTour();
					
					// Paul
					des.lancerDeDePipe(c,pl,19);
					c.AcheterBien();
					c = p.passesonTour();
					
					// Luc
					des.lancerDeDePipe(c,pl,0);
					c.ConstruireMaison(pl.listeCases.get(5)); // construit sur rue de la paix
					c = p.passesonTour();
					
					//Theo
					des.lancerDeDePipe(c, pl, 34);
					c = p.passesonTour();
			
					System.out.println(" FIN DE LA PARTIE ");
					p.liste.clear();
					//p.liste.get(0).kase = pl.l.get(32);
					//p.liste.get(1).kase = pl.l.get(29); 

					}
				
			if (choix == 2){
					System.out.println("Ecrire le nom du joueur :");
				 	choixstring = sc.next();
					p.connexion(choixstring);
				}

			if (choix == 3){
					if(p.liste.size() <2){
						System.out.println("Il n'y a pas assez de joueur inscrit dans la partie !");
					}
					else{
						
						System.out.println("Les joueurs jouerons dans cette ordre : ");

						for(int i = 0;i < p.liste.size();i++) {

							System.out.print( p.liste.get(i).nom + " ");
						}

						System.out.println("");
			
						Joueur c = p.lancerPartie();
			
						Plateau pl = p.getPlateau();

						Des des = new Des();

						boolean fini = false;

							des.lancerDeDe(c,pl);

						while(!fini){

							if(c.getCaseC().cout != 0){
							CasePropriete cp = (CasePropriete) c.getCaseC();
								if(cp.prixMaison != 0){
									System.out.println("Acheter au prix de "+ c.getCaseC().prixachat + " : tapez 1" );
									System.out.println("Construire au prix de " + cp.prixMaison +" : tapez 2");
									System.out.println("Passer : tapez 3");

									int choix2 = sc.nextInt();
								
							

							if(choix2 == 1){
								c.AcheterBien();
							}

							if(choix2 == 2){
								c.ConstruireMaison(c.kase);
							}



							if(choix2 == 3){
								c = p.passesonTour();
								des.lancerDeDe(c,pl);
								if( c.argentJ < 0){
									fini = true;
								}
							}
							}
							else{
									System.out.println("Acheter au prix de "+ c.getCaseC().prixachat + " : tapez 1" );
									System.out.println("Vous ne pouvez pas construire ici !");
									System.out.println("Passer : tapez 2");

									int choix2 = sc.nextInt();
								
							

							if(choix2 == 1){
								c.AcheterBien();
							}

							if(choix2 == 2){
								c = p.passesonTour();
								des.lancerDeDe(c,pl);
								if( c.argentJ < 0){
									fini = true;
								}
							}


							}
							}
							else{
								System.out.println("Vous ne pouvez pas acheter cette maison. \n" );
								System.out.println("Vous ne pouvez pas construire sur ce terrain. \n");
								System.out.println("Passer : tapez 1");
	
								int choix2 = sc.nextInt();
	
								if(choix2 == 1){
									c = p.passesonTour();
									des.lancerDeDe(c,pl);
									if( c.argentJ < 0){
										fini = true;
									}
				
								}
								}
							

						}
					}
						}
						
					}
				}
			}
