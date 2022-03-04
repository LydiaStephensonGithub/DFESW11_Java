package taxes;

public class Taxes {
	
	private int salary;
	
	public Taxes(int salary) {
		this.salary = salary;
	}
	
	public int taxBracket() {
		if (salary > 0 && salary <= 14999) {
			return 0;
		} else if (salary > 15000 && salary <= 19999) {
			return 10;
		} else if (salary > 20000 && salary <= 29999) {
			return 15;
		} else if (salary > 30000 && salary <= 44999) {
			return 20;
		} else {
			return 25;
		}
	}
	
	public int taxAmount() {
		return (salary / 100) * this.taxBracket();
	}
}
