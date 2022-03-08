package fizzbuzz;

public class FizzBuzz {
	public static String fizzbuzz(int n) {
		if (n % 15 == 0) {
			return "FizzBuzz";
		} else if (n % 3 == 0) {
			return "Fizz";
		} else {
			return "Buzz";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fizzbuzz(30));
		System.out.println(fizzbuzz(9));
		System.out.println(fizzbuzz(55));
	}
}
