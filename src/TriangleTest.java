/**
 * SE320- Individual Assignment 5
 * 
 * Tests Triangle Object's Methods
 * @author Daniel Osterman
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

final int SIDEA = 3;
final int SIDEB = 4;
final int SIDEC = 5;
final int PERIMETER = SIDEA + SIDEB + SIDEC;
/**
 * Reusable method for testing to create triangle or return error if unsuccessful
 *@return Triangle Object
 */
	public Triangle createTriangle(){

		Triangle tester;
		try{
			tester = new Triangle(SIDEA, SIDEB, SIDEC);
		}catch(Exception e){
			fail("Could not Generate Triangle");
			tester = null;
		}
		return tester;
	}	

    /**
     * Tests Side length validation method
     */
	@Test
	public void testValidate() {

		Triangle t = createTriangle();
		assertFalse(t.validateInput(0, 0, 0));
		assertTrue(t.validateInput(1, 2, 3));
	}
    /**
     * Tests that Triangle takes on the submitted parameters as side lengths
     */
	@Test
	public void testSides() {
		Triangle t = createTriangle();
		assertEquals(t.getSideA(), SIDEA, 0);
		assertEquals(t.getSideB(), SIDEB, 0);
		assertEquals(t.getSideC(), SIDEC, 0);
	}
	
    /**
     * Tests Correctness of Perimeter function
     */
	@Test
	public void testPerimeter(){
		Triangle t = createTriangle();
		assertEquals(t.getPerimeter(), PERIMETER, 0);
	}
	
    /**
     * Tests Area Calculation for faulty answers
     */
	@Test
	public void testArea(){
		Triangle t = createTriangle();
		assertTrue(t.getArea()>0);
	}
	



}
