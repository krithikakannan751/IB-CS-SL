/**
 * @(#)Sphere.java
 *
 *
 * @author Krithika Kannan
 * @version 1.00 2017/10/30
 */


public class Sphere {
	
	// instance fields
	private double r;

	/**
	 * Constructs an empty Sphere
	 */
    public Sphere() {
    r = 0;
    }
    
    /**
	 * Adds a radius
	 * @param radius
	 */
    public Sphere(double radius)
    {
    	r=radius;
    }
    
    /**
	 * Uses radius to calculate volume
	 * @return volume
	 */
    public double getVolume()
    {
    	return (double) 4/3 * Math.PI * Math.pow(r,3);
    }
    
    /**
	 * Uses radius to calculate surface area
	 * @return surface area
	 */
    public double getSurfaceArea()
    {
    	return (double) 4 * Math.PI * Math.pow(r,2);
    }
}