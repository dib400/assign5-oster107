/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Right Angled Triangle
 * @author Dr. Donyina
 * @author Daniel Osterman
 */
public class RightAngledTriangle extends Triangle {
	 /**
     * Creates RightAngledTriangle object
     * @param width
     * @param height
     * @param hypotenuse
     * @throws Exception
     */
    RightAngledTriangle(double width, double height, double hypotenuse)
            throws Exception {

        super(width, height, hypotenuse);
    }
    
    /**
     * Validates Triangle side lengths are realistic
     * <p>
     * ERROR FOUND:
     * Does not validate that inputs are valid numbers
     * Add original Triangle's validate check to conditional
     * Old Code:
     * 
     *if((sideC * sideC) == ((sideA * sideA) + (sideB * sideB))){
     *      return true;
     *  }
     *  
     * @param sideA first side of the triangle
     * @param sideB second side of the triangle
     * @param sideC third side of the triangle
     */
    public boolean validateInput(double sideA, double sideB, double sideC) {

        if(super.validateInput(sideA, sideB, sideC) && (sideC * sideC) == ((sideA * sideA) + (sideB * sideB))){
            return true;
        }
        
        return false;
    }

    /**
     * Calculates Area using formula for triangles
     *@return RightAngledTriangle Area
     */
    public double getArea() {
        return ((sideA * sideB) / 2);
    }

}
