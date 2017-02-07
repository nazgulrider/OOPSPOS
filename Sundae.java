package point.of.sale;

public class Sundae extends IceCream {
	public final double topping=2.0;
	
	
	public Sundae(String name) {
		super(name);
		
	}
	
	
	public double getChocolateSundae(){
		return super.getChocolate()+topping;
	}
	public double getVanillaSundae(){
		return super.getVanilla()+topping;
	}
	public double getStrawberrySundae(){
		return super.getStrawberry()+topping;
	}
}
