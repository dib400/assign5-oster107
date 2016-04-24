/**
 * SE320- Individual Assignment 5
 * 
 * Tests RightAngledTriangle Object's Methods
 * @author Daniel Osterman
 */
import static org.junit.Assert.*;

import org.junit.Test;


public class RightAngledTriangleTest {

	final int SIDEA = 3;
	final int SIDEB = 4;
	final int SIDEC = 5;
    /**
     * Reusable method for testing to create right angled triangle or return error if unsuccessful
     *@return RightAngledTriangle Object
     */
	public RightAngledTriangle createTriangle(){
		RightAngledTriangle tester;
		try{
			tester = new RightAngledTriangle(SIDEA, SIDEB, SIDEC);
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
		RightAngledTriangle t = createTriangle();
		assertFalse(t.validateInput(0, 0, 0));
		assertFalse(t.validateInput(1, 2, 3));
		assertTrue(t.validateInput(3,4,5));
	}
	
    /**
     * Tests Area Calculation method
     */
	@Test
	public void testArea(){
		RightAngledTriangle t = createTriangle();
		assertTrue(t.getArea()>0);
	}

}
