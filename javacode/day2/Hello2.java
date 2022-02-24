package day2;

public class Hello2{
	public static void main(String[] args) {
		int x = 0b00001011;
		System.out.println(x);

		byte score = 90;
		short amount = 2_8000;
		int salary = 15_0000;
		long stars = 100_0000_0000L;
		System.out.println("score = " + score);
		System.out.println("amount = " + amount);
		System.out.println("salary = " + salary);
		System.out.println("stars = " + stars);
        
        // format data
        // java 1.4 printf %d \n\
        System.out.printf("amount: %d\n", amount);
        System.out.printf("salary: %d\n", salary);
        System.out.printf("stars: %d\n", stars); 
}