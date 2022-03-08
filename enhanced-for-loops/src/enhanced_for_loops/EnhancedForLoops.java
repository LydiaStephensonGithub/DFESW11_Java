package enhanced_for_loops;

public class EnhancedForLoops {
	public static void output() {
		String[] strArray = {"This", "is", "an", "array"};
		
		for (String str : strArray) {
			System.out.println(str);
		}
	}
	
	public static void one2Twenty(int[] array) {
		for (int i : array) {
			i *= i;
			System.out.println(i);
		}
	}
	
	public static int isEven(int n) {
		if (n % 2 == 0) {
			return n = n * n * n;
		} else {
			return n = n * n;
		}
	}
	
	public static void intCheck(int[] array) {
		for (int i : array) {
			System.out.println(isEven(i));
		}
	}
	
	public static void main(String[] args) {
		
		int[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		output();
		one2Twenty(intArray);
		intCheck(intArray);
	}
}
