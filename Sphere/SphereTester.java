//*** Your heading here!!!

/**
 * A class to test the Sphere class
 */
 public class SphereTester
{
	/**
	 * Tests the methods of the Sphere class
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		// Create a sphere object with a radius of 32.5
		Sphere Sphere1 = new Sphere(32.5);
		System.out.println("Sphere1: ");
		System.out.println(" ");
		System.out.print("Volume:  ");
		System.out.printf("%.3f",Sphere1.getVolume());
		System.out.println(" ");
		System.out.print("Surface Area:  ");
		System.out.printf("%.3f",Sphere1.getSurfaceArea());
	
	
		// Create a 2nd sphere object with a radius of 8.25
		System.out.println(" ");
		Sphere Sphere2 = new Sphere(8.25);
		System.out.println(" ");
		System.out.println("Sphere2: ");
		System.out.println(" ");
		System.out.print("Volume:  ");
		System.out.printf("%.3f",Sphere2.getVolume());
		System.out.println(" ");
		System.out.print("Surface Area:  ");
		System.out.printf("%.3f",Sphere2.getSurfaceArea());
		
	}
	
	
}