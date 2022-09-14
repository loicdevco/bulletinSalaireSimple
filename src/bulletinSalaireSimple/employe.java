package bulletinSalaireSimple;

public class employe {

	protected String nom;
	protected String Prenom;
	protected String Statut;
	protected int nbreHeures;
	protected int nbreEnfants;
	protected int prime;
	protected double tauxHoraire;
	protected double netAPayer;

	public double getNetAPayer() {
		return netAPayer;
	}

	public void setNetAPayer(double netAPayer) {
		this.netAPayer = netAPayer;
	}

	public double getTauxHoraire() {
		return tauxHoraire;
	}

	public void setTauxHoraire(double tauxHoraire) {
		this.tauxHoraire = tauxHoraire;
	}

	public int getPrime() {
		return prime;
	}

	public void setPrime(int prime) {
		this.prime = prime;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getStatut() {
		return Statut;
	}

	public void setStatut(String statut) {
		Statut = statut;
	}

	public int getNbreHeures() {
		return nbreHeures;
	}

	public void setNbreHeures(int nbreHeures) {
		this.nbreHeures = nbreHeures;
	}

	public int getNbreEnfants() {
		return nbreEnfants;
	}

	public void setNbreEnfants(int nbreEnfants) {
		this.nbreEnfants = nbreEnfants;
	}

	public String contenuBDS() {
		String affichage = "Récap de l'employé(e) : " + this.nom + " " + this.Prenom + " " + this.Statut + " "
				+ this.nbreHeures + "h travaillées, " + this.prime + " euros " + " taux horaire : " + this.tauxHoraire
				+ " salaire : " + this.getNetAPayer();
		return affichage;
	}

}
