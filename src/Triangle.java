
/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Triangle
 * @author Dr. Donyina
 * @author Daniel Osterman
 */
public class Triangle {
    
 
    protected double sideA;
    
   
    protected double sideB;
    
    
    protected double sideC;
    
 
    
    /**
     * Generates new Triangle object with given dimensions 
     * @param sideA first side of the triangle
     * @param sideB second side of the triangle
     * @param sideC third side of the triangle
     */
    Triangle(double sideA, double sideB, double sideC) throws Exception {

        if (!validateInput(sideA, sideB, sideC)) {
            throw new Exception("Invalid Inputs");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    /**
     * Validates Triangle side lengths are realistic
     * @param sideA first side of the triangle
     * @param sideB second side of the triangle
     * @param sideC third side of the triangle
     */
    public boolean validateInput(double sideA, double sideB, double sideC) {

       if( sideA > 0 && sideB > 0 && sideC > 0){
           return true;
       }
       else return false;
    }
    /**
     *@return side A of this Triangle
     */
    public double getSideA() {

        return this.sideA;
    }
    
    /**
     *@return side B of this Triangle
     */
    public double getSideB() {

        return this.sideB;
    }
    
    /**
     *@return side C of this Triangle
     */
    public double getSideC() {

        return this.sideC;
    }
    
    /**
     * Calculates perimeter by adding sides together
     *@return Triangle perimeter
     */
    public double getPerimeter() {

        return sideA + sideB + sideC;
    }
    
    /**
     * Calculates Area using formula for triangles
     *@return Triangle Area
     */
    public double getArea() {

        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

}
