package runner;

import results.Results;

public class Runner {

	public static void main(String[] args) {
		
		Results student1 = new Results(85, 94, 122);
		
		System.out.println(student1.total());
		System.out.println(student1.percentage());

	}

}
