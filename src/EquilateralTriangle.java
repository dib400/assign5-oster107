/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Equilateral Triangle
 * @author Dr. Donyina
 * @author Daniel Osterman
 */
public class EquilateralTriangle extends Triangle {
    /**
     * Instantiates Triangle with only one length for all three sides
     * @param length a side of the triangle
     * @throws Exception
     */
    EquilateralTriangle(double length)
            throws Exception {

        super(length, length, length);
    }

    /**
     * Validates first length given is real value for triangle to use
     * @param sideA first side of the triangle
     * @param sideB second side of the triangle
     * @param sideC third side of the triangle
     */
    public boolean validateInput(double sideA, double sideB, double sideC) {

    	return sideA > 0;
    }


    /**
     * Calculates equilateral area using function
     * @return EquilateralTriangle area
     */
    public double getArea() {

        return (Math.sqrt(5)/4) * sideA * sideA;
    }

}
