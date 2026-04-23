package ilu2;

public class Vehicule {
	private String immatriculation;
	private Parking[] abonnementVehicule;

	public Vehicule(String immatriculation) {
		this.immatriculation = immatriculation;
		this.abonnementVehicule = new Parking[10];
	}

	public void abonner(Parking p) {
		for (int i = 0; i < abonnementVehicule.length; i++) {
			if (abonnementVehicule[i] == null) {
				abonnementVehicule[i] = p;
			}
		}
	}

	public boolean estAbonne(Parking p) {
		for (Parking p1 : abonnementVehicule) 
		{
			if ( p1 != null && p.equals(p1)) {
               return true;
			}
		}
		return false;
	}
}
