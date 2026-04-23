package ilu2;

public class Parking {

	private int nbPlacesLibres;
	private int tarifHoraire;
	private Vehicule[] vehiculeGare;
	private int nbrVehiculeGaree = 0;

	// constructeur
	public Parking(int nbPlaces, int tarif) {
		this.nbPlacesLibres = nbPlaces;
		this.tarifHoraire = tarif;
        this.vehiculeGare = new Vehicule[nbPlaces];
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
			vehiculeGare[nbrVehiculeGaree]=v;
			nbPlacesLibres--;
			return true;
		}
		
	}

	public int retirer(Vehicule v, int nbrHeure) {
		nbPlacesLibres++;
		return nbrHeure * tarifHoraire;
	}
	
	public boolean contient(Vehicule v) {
		
		for ( Vehicule v1 : vehiculeGare )
		{
			if ( v.equals(v1) ) {
				return true;
			}
		}
		return false;
		
	}
	

}
