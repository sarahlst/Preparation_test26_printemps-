package ilu2;

public class Parking {
	
	private int nbPlacesLibres;
	// constructeur
	public Parking(int nbPlaces) {
		this.nbPlacesLibres = nbPlaces;
	}
	
	public int getNbPlacesLibres() {
		return nbPlacesLibres;
	}
	
    public void ajouter(Vehicule v) {
    	nbPlacesLibres--;
	}
    public void retirer(Vehicule v) {
    	nbPlacesLibres++;
    }
	
	

}
