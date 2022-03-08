package results;

public class Results {
	private int physics;
	private int chemistry;
	private int biology;
	private int total;
	private int percentage;
	
	public Results(int physics, int chemistry, int biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
	}
	
	public int total() {
		total = physics + chemistry + biology;
		return this.total;
	}
	
	public int percentage() {
		percentage = (this.total() * 100) / 450;
		return percentage;
	}
	
	public int classPercentage(int exam) {
		return (exam * 100) / 150;
	}

	public String reportCard() {
		if (this.percentage() > 60) {
			if (this.classPercentage(physics) < 60 && this.classPercentage(biology) < 60) {
				return "Your grade is " + percentage + "%. You did not pass physics and biology.";
			} else if (this.classPercentage(physics) < 60 && this.classPercentage(chemistry) < 60) {
				return "Your grade is " + percentage + "%. You did not pass physics and chemistry.";
			} else if (this.classPercentage(biology) < 60 && this.classPercentage(chemistry) < 60) {
				return "Your grade is " + percentage + "%. You did not pass biology and chemistry.";
			} else if (this.classPercentage(physics) < 60) {
				return "Your grade is " + percentage + "%. You did not pass physics.";
			} else if (this.classPercentage(chemistry) < 60) {
				return "Your grade is " + percentage + "%. You did not pass chemistry.";
			} else if (this.classPercentage(biology) < 60) {
				return "Your grade is " + percentage + "%. You did not pass biology.";
			} else {
				return "Your grade is " + percentage + "%. You have passed!";
			}
		} else {
			return "Your grade is " + percentage + "%. You have not passed.";
		}
	}
	
}
