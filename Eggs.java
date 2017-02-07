package point.of.sale;

public class Eggs extends RetailItem {
	public double numberOfEggs;
	public static final double pricePerDozen=3.0;

	public Eggs(String name, int numberOfEggs) {
		super(name);
		this.numberOfEggs = numberOfEggs;
	}
	@Override
	public double getCost() {
		System.out.printf("Price per dozen is $%s\n",pricePerDozen);
		return numberOfEggs/12*pricePerDozen;
	}
	
	
	

}
