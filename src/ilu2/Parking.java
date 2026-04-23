package ilu2;

public class Parking {

	private int nbPlacesLibres;
	private int tarifHoraire;

	// constructeur
	public Parking(int nbPlaces, int tarif) {
		this.nbPlacesLibres = nbPlaces;
		this.tarifHoraire = tarif;
	}

	public int getNbPlacesLibres() {
		return nbPlacesLibres;
	}

	public boolean ajouter(Vehicule v) {
		if ( nbPlacesLibres == 0 )
		{
			return false;
		}
		else {
			nbPlacesLibres--;
			return true;
		}
		
	}

	public int retirer(Vehicule v, int nbrHeure) {
		nbPlacesLibres++;
		return nbrHeure * tarifHoraire;
	}
	

}
