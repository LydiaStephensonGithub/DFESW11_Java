package numbers;

public class Numbers {
	public static void printTen() {
		for (int i = 1; i <= 10; i++) {
			System.out.println();
			for (int j = 1; j <= 10; j++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void printNum() {
		for (int i = 1; i <= 10; i++) {
			System.out.println();
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void addDigit(int n) {
		int count = 0;
		while (n >= 10) {
			n -= 10;
			count++;
		}
		System.out.println(count + n);
	}
	
	public static void numString(int n) {
		String[] ddigit = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String[] sdigit = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] tdigit = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		int th = 0;
		int h = 0;
		int t = 0;
		String digits = "";
		String hundred = "";
		String thousand = "";
		
		while (n >= 1000) {
			n -= 1000;
			th++;
		} while (n >= 100) {
			n -= 100;
			h++;
		} while (n >= 10) {
			n -= 10;
			t++;
		}
		
		if (th > 0) {
			thousand = sdigit[th - 1] + " thousand ";
		} else {
			thousand = "";
		}
		
		if (h > 0) {
			hundred = sdigit[h - 1] + " hundred ";
		}
		
		if (n == 0 && t == 0) {
			digits = "";
		} else if (t == 1) {
			digits = tdigit[n];
		} else if (n == 0) {
			digits = ddigit[t - 1];
		} else if (t == 0) {
			digits = sdigit[n - 1];
		} else {
			digits = ddigit[t - 1] + " " + sdigit[n - 1];
		}

		System.out.println(thousand + hundred + digits);
	}
	
	public static void main(String[] args) {
		//printTen();
		//printNum();
		//addDigit(74);
		//numString(21);
		for (int i = 0; i <= 100; i++) {
			numString(i);
		}

	}
}
