package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParkingTest {
	private Parking p;

	@Test
	void test1() {
		p = new Parking(10);
		assertEquals(10,p.getNbPlacesLibres());
	}

}
