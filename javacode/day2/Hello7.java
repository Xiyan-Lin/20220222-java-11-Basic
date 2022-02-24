package day2;

public class Hello7{
	public static void main(String[] args) {
		int h = 170;
		int w = 60;
		double bmi = w / Math.pow(h/100.0,2);
		System.out.printf("bmi= %.2f\n", bmi);
	}
}