package flowcharts;

public class Flowcharts {
	public static void sumMultiply(int n1, int n2, boolean bool) {
		if (bool == true) {
			System.out.println(n1 + n2);
		} else {
			System.out.println(n1 * n2);
		}
	}

	public static void flowchart1(int A) {
		if (A > 2000) {
			System.out.print("A ");
			if (A > 6000) {
				System.out.println("C");
			} else {
				System.out.print("B ");
				if (A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.print("1 ");
			if (A > 100) {
				System.out.print("3 ");
				if (A > 600) {
					System.out.println("5");
				} else {
					System.out.print("4 ");
					if (A > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}

	public static void main(String[] args) {
		sumMultiply(7, 2, false);
		flowchart1(2906);
	}
}
