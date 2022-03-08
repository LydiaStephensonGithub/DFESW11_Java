package menu;

import java.util.Scanner;

import calculator.Calculator;

public class Menu {
	Scanner scan = new Scanner(System.in);
	private int n1;
	private int n2;
	private boolean calcOn = true;
	
	public void start() {
		System.out.println("Please select an operation:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("0. EXIT");
		
		while (calcOn == true) {
			int operation = scan.nextInt();
			
			if (operation > 0 && operation <= 4) {
				System.out.println("Please enter the first operand");
				n1 = scan.nextInt();
				System.out.println("Please enter the second operand");
				n2 = scan.nextInt();
			}
			
			switch(operation) {
			case 1: 
				System.out.println("ANSWER: " + Calculator.addition(n1, n2));
				break;
			case 2:
				System.out.println("ANSWER: " + Calculator.subtraction(n1, n2));
				break;
			case 3:
				System.out.println("ANSWER: " + Calculator.multiplication(n1, n2));
				break;
			case 4:
				System.out.println("ANSWER: " + Calculator.division(n1, n2));
				break;
			case 0:
				calcOn = false;
				System.out.println("EXIT");
				break;
			default:
				System.out.println("Please check input");
			}
		}
		scan.close();
	}
}
