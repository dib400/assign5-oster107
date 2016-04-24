/**
 * SE320- Individual Assignment 5
 * 
 * Tests EquilateralTriangle Object's Methods
 * @author Daniel Osterman
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class EquilateralTriangleTest {
	final int SIDE = 3;
    /**
     * Reusable Method for creating equilateral triangle object for testing purposes
     * @return EquilateralTriangle object
     */
	public EquilateralTriangle createTriangle(){

		EquilateralTriangle tester;
		try{
			tester = new EquilateralTriangle(SIDE);
		}catch(Exception e){
			fail("Could not Generate Triangle");
			tester = null;
		}
		return tester;
	}	

	/**
	 * Tests Validation Method of EquilateralTriangle object
	 */
	@Test
	public void testValidate() {

		EquilateralTriangle t = createTriangle();
		assertFalse(t.validateInput(0, 0, 0));
		assertTrue(t.validateInput(1, 2, 3));
	}
	
	/**
	 * Tests Area calculation method
	 */
	@Test
	public void testArea(){

		Triangle t = createTriangle();
		assertTrue(t.getArea()>0);
	}

}
