package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParkingTest {
	private Parking p;

	@Test
	void test1() {
		p = new Parking(10,0);
		assertEquals(10,p.getNbPlacesLibres());
	}
	
	@Test
	void test2() {
		p = new Parking(10,0);
		Vehicule v = new Vehicule("1"); 
		p.ajouter(v);
		assertEquals(9,p.getNbPlacesLibres());
	}
	
	@Test
	void test3() {
		p = new Parking(9,0);
		Vehicule v = new Vehicule("1"); 
		p.retirer(v,0);
		assertEquals(10,p.getNbPlacesLibres());
	}
	
	@Test
	void test4() {
		p = new Parking(10, 3); 
		Vehicule v = new Vehicule("1"); 
		p.ajouter(v); 
		p.retirer(v,5);
		assertEquals(15,p.retirer(v,5));
		assertEquals(11,p.getNbPlacesLibres());
		
	}

}
