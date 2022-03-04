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
		this.total = this.physics + this.chemistry + this.biology;
		return this.total;
	}
	
	public String percentage() {
		this.percentage = (this.total * 100) / 450;
		return this.percentage + "%";
	}
}
