
package fr.eni.tp.bulletin.ihm;

import java.util.Scanner;

public class BulletinSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String quit = "quit";
		int agentDeService = 1;
		int employeDeBureau = 2;
		int cadre = 3;

		System.out.println("Veuillez saisir votre nom ou " + quit + " pour quitter");
		String nom = scan.nextLine();
		while (nom != quit) {

			System.out.println("Veuillez saisir votre prénom");
			String prenom = scan.nextLine();
			System.out.println("Veuillez saisir votre statut : ");
			System.out.println(+agentDeService + "-Agent de service ");
			System.out.println(+employeDeBureau + "-Employé de bureau ");
			System.out.println(+cadre + "-Cadre ");
			int statut = scan.nextInt();
			if (statut != agentDeService || statut != employeDeBureau || statut != cadre) {
				System.out.println("erreur de saisie");
			}

//TO DO récupération nombres d'heures, nombre d'enfant, taux horaire

			// faire une fonction calcul du salaire brut
			// calcul du salaire net
			// fonction pour la prime familiale, récupération du résultat
			// calcul du salaire net à payer
			// bloc d'affichage des résultats

			scan.close();
		}
	}
}
