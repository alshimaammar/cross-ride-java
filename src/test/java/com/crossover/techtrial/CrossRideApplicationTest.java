/**
 * 
 */
package com.crossover.techtrial;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.crossover.techtrial.controller.PersonController;
import com.crossover.techtrial.controller.RideController;

/**
 * @author crossover
 *
 */
public class CrossRideApplicationTest {

	@BeforeClass
	public void beforeClass() {
		System.out.println("start All Test Cases");
	}

	@Before
	public void before() {

		System.out.println("start of Test Case");

	}
	
	@Test
	public void test() {

		RideController rideController = new RideController();
		PersonController personController = new PersonController();
		// assertEquals(String message, long expected, long actual)
		assertEquals("error in get all rides", 3, rideController.getAllRides().getBody().size());
		assertEquals("error in get all persons", 4, personController.getAllPersons().getBody().size());
		assertEquals("error in validate save ride", 4, personController.getAllPersons().getBody().size());
	}

	@After
	public void after() {

		System.out.println("End of Test Case");

	}

	@AfterClass
	public void afterClass() {

		System.out.println("End All Test Case");

	}

}
