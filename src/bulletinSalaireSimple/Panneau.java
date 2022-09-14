package bulletinSalaireSimple;

import java.util.Scanner;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel {
	public void paintComponent(Graphics g) {
		// Vous verrez cette phrase chaque fois que la m�thode sera invoqu�e
		// TODO Auto-generated method stub

		System.out.println("--------------- Bulletin de salaire --------------- ");
		System.out.println("--------------------------------------------------------------------------------------");

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le nom de l'employe(e) :");

		employe e1 = new employe();
		e1.setNom(sc.next());

		System.out.println("Entrer le pr�nom de l'employ�(e) :");
		e1.setPrenom(sc.next());

		System.out.println("Choisissez le statut de votre employ�(e) : ");
		System.out.println("1- Cadre ");
		System.out.println("2- Agent de ma�trise ");
		System.out.println("3- Employ� de bureau ");

		int statut = sc.nextInt();

		switch (statut) {
		case 1:
			e1.setStatut("Cadre");
			e1.setTauxHoraire(20.12);
			break;
		case 2:
			e1.setStatut("Agent de ma�trise");
			e1.setTauxHoraire(15.42);
			break;
		case 3:
			e1.setStatut("Employ� de bureau");
			e1.setTauxHoraire(10.69);
			break;
		default:
			System.out.println("ERROR");
			break;
		}

		System.out.println("Entrer le nombre d'heures r�alis�s par cet(te) employ�(e):");
		e1.setNbreHeures(sc.nextInt());

		double majoration;
		double majoration2;
		double salaire;

		salaire = e1.getNbreHeures() * e1.getTauxHoraire();
		majoration = ((e1.getNbreHeures() - 169) * 0.5);
		majoration2 = ((e1.getNbreHeures() - 180) * 0.6);

		if (e1.getNbreHeures() <= 169 && e1.getNbreHeures() < 180) {

			salaire = salaire + majoration;

		} else if (e1.getNbreHeures() >= 180) {

			salaire = salaire + majoration + majoration2;
		}

		do {
			System.out.println("Entrer le nombre d'enfants poss�d�s par cet(te) employ�(e):");
			e1.setNbreEnfants(sc.nextInt());
		} while (e1.nbreEnfants < 0);

		switch ((e1.getNbreEnfants() >= 0) ? e1.getNbreEnfants() : -1) {
		case -1:
			System.out.println("ERROR");
			break;
		case 0:
			e1.setPrime(0);
			break;
		case 1:
			e1.setPrime(20);
			break;
		case 2:
			e1.setPrime(50);
			break;
		default:
			e1.setPrime(70 + (20 * (e1.getNbreEnfants() - 2)));
			break;
		}

		e1.setNetAPayer(salaire - 121.36 + e1.getPrime());
		g.drawString(e1.contenuBDS(), 150, 300);
	}
}
