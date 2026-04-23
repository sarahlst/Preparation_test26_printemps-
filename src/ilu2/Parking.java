package ilu2;

public class Parking {

	private int nbPlacesLibres;
	private int tarifHoraire;
	private Vehicule[] vehiculeGare;
	private int nbrVehiculeGare = 0;

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
        if (nbPlacesLibres == 0) 
        	return false;
        
        for (int i = 0; i < vehiculeGare.length; i++) {
            if (vehiculeGare[i] == null) {
                vehiculeGare[i] = v;
                nbPlacesLibres--;
                return true;
            }
        }
        return false;
    }

	public int retirer(Vehicule v, int nbrHeure) {

		if (!contient(v))
		{
                 throw new IllegalArgumentException("Ce vehicule n'est pas garé dans le Parking ");
		}
		
		for (int i = 0; i < vehiculeGare.length; i++) {
            if (v.equals(vehiculeGare[i])) {
                vehiculeGare[i] = null; 
                break;
            }
        }

        nbPlacesLibres++;
        return nbrHeure * tarifHoraire;

	
	}

	public boolean contient(Vehicule v) {

		for (Vehicule v1 : vehiculeGare) {
			if (v1 != null && v1.equals(v)) {
				return true;
			}
		}
		return false;

	}

}
