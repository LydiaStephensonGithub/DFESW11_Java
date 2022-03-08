package runner;

import taxes.Taxes;

public class Runner {
	public static void main(String[] args) {
		Taxes client1 = new Taxes(12500);
		Taxes client2 = new Taxes(18000);
		Taxes client3 = new Taxes(27500);
		Taxes client4 = new Taxes(46500);
		Taxes client5 = new Taxes(65000);
		
		System.out.println(client1.taxAmount());
		System.out.println(client2.taxAmount());
		System.out.println(client3.taxAmount());
		System.out.println(client4.taxAmount());
		System.out.println(client5.taxAmount());
	}
}
