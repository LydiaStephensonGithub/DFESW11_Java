package coins;

public class Coins {
	
	private int fifty = 0;
	private int twenty = 0;
	private int ten = 0;
	private int five = 0;
	private int twoPound = 0;
	private int pound = 0;
	private int fiftyp = 0;
	private int twentyp = 0;
	private int tenp = 0;
	private int fivep = 0;
	private int twop = 0;
	private int onep = 0;
	
	public void change(double price, double amount) {
		price *= 100;
		amount *= 100;
		
		double change = amount - price;
		
		while (change >= 5000) {
			change -= 5000;
			fifty++;
		} while (change >= 2000) {
			change -= 2000;
			twenty++;
		} while (change >= 1000) {
			change -= 1000;
			ten++;
		} while (change >= 500) {
			change -= 500;
			five++;
		} while (change >= 200) {
			change -= 200;
			twoPound++;
		} while (change >= 100) {
			change -= 100;
			pound++;
		} while (change >= 50) {
			change -= 50;
			fiftyp++;
		} while (change >= 20) {
			change -= 20;
			twentyp++;
		} while (change >= 10) {
			change -= 10;
			tenp++;
		} while (change >= 5) {
			change -= 5;
			fivep++;
		} while (change >= 2) {
			change -= 2;
			twop++;
		} while (change >= 1) {
			change -= 1;
			onep++;
		}
		
		System.out.println("£50: " + fifty + " £20: " + twenty + " £10: " +
		ten + " £5: " + five + " £2: " + twoPound + " £1: " + pound + " 50p: " + 
		fiftyp + " 20p: " + twentyp + " 10p: " + tenp + " 5p: " + fivep + " 2p: " + 
		twop + " 1p: " + onep);
	}
}
