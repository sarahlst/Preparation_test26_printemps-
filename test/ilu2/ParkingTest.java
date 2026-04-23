package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParkingTest {
	private Parking p;

	@Test
	void test1() {
		p = new Parking(10, 0);
		assertEquals(10, p.getNbPlacesLibres());
	}

	@Test
	void test2() {
		p = new Parking(10, 0);
		Vehicule v = new Vehicule("1");
		p.ajouter(v);
		assertEquals(9, p.getNbPlacesLibres());
	}

	@Test
	void test3() {
		p = new Parking(9, 0);
		Vehicule v = new Vehicule("1");
		p.ajouter(v);
		p.retirer(v, 0);
		assertEquals(9, p.getNbPlacesLibres());
	}
 
	@Test
	void test4() {
		p = new Parking(10, 3);
		Vehicule v = new Vehicule("1");
		p.ajouter(v);
		assertEquals(15, p.retirer(v, 5));
		assertEquals(10, p.getNbPlacesLibres());

	}

	@Test
	void test5() {
		p = new Parking(10, 3);
		Vehicule v = new Vehicule("1");
		p.ajouter(v);
		assertEquals(true, p.ajouter(v));
		Parking p1 = new Parking(0, 3);
		Vehicule v1 = new Vehicule("2");
		p.ajouter(v1);
		assertEquals(false, p1.ajouter(v));
	}

	@Test
	void test6() {
		Parking p = new Parking(10, 3);  
		Vehicule v = new Vehicule("1"); 
		Vehicule v1 = new Vehicule("2");
		p.ajouter(v); 
		assertEquals(true,p.contient(v));
		assertEquals(false, p.contient(v1));
		
		
	}
	
	@Test
	void test7() {
		Parking p1 = new Parking(100, 0); 
		Parking p2 = new Parking(100, 0); 
		Vehicule v = new Vehicule("1"); 
		p1.ajouter(v); 
		assertEquals(0,p1.retirer(v, 1)); 
		assertThrows(IllegalArgumentException.class, () -> {
			p2.retirer(v, 1);
	    });

	}
	
	@Test
	void test8() {
		Parking p1 = new Parking(100, 0); 
		Parking p2 = new Parking(100, 0); 
		Vehicule v = new Vehicule("1"); 
		v.abonner(p1); 
		assertEquals(true,v.estAbonne(p1));
		assertEquals(false,v.estAbonne(p2));

	} 

}
