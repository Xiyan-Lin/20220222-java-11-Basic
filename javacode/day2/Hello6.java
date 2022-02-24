package day2;

public class Hello6{
	public static void main(String[] args) {
		int r = 59;
		final double pi = 3.14;
		double area = r*r*pi;
		System.out.printf("area = %.2f\n", area);
		double volume = 4/3.0 * pi * Math.pow(r,3);
		System.out.printf("volume= %,.2f\n", volume); 

		double area2 = Math.pow(r,2) * Math.PI;
		double volume2 = 4/3.0 * Math.PI * Math.pow(r,3); 
	    System.out.printf("area2 = %.2f\n", area2);
		System.out.printf("volume2 = %,.2f\n", volume2); 

	}
}