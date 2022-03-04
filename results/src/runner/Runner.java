package runner;

import results.Results;

public class Runner {

	public static void main(String[] args) {
		Results student1 = new Results(150, 150, 150);
		Results student2 = new Results(0, 0, 0);
		Results student3 = new Results(150, 84, 84);
		Results student4 = new Results(84, 84, 150);
		Results student5 = new Results(84, 150, 84);
		Results student6 = new Results(84, 150, 150);
		Results student7 = new Results(150, 84, 150);
		Results student8 = new Results(150, 150, 84);
		
		System.out.println(student1.reportCard());
		System.out.println(student2.reportCard());
		System.out.println(student3.reportCard());
		System.out.println(student4.reportCard());
		System.out.println(student5.reportCard());
		System.out.println(student6.reportCard());
		System.out.println(student7.reportCard());
		System.out.println(student8.reportCard());

	}

}
