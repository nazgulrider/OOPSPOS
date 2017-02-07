package point.of.sale;

public abstract class RetailItem {
	
	private String name;
	
	public abstract double getCost();

	public RetailItem(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRedPotato() {
		return 0;
	}
	public double getWhitePotato() {
		return 0;
	}
	public double getSweetPotato() {
		return 0;
	}

	public double getChocolate() {
		return 0;
	}
	public double getVanilla() {
		return 0;
	}
	public double getStrawberry() {
		return 0;
	}

	public double getChocolateSundae() {
		return 0;
	}
	public double getVanillaSundae() {
		return 0;
	}
	public double getStrawberrySundae() {
		return 0;
	}
	
	
	
}
