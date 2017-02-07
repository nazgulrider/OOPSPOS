package point.of.sale;

public class Potatoes extends RetailItem {

	public double weight;
	
	public Potatoes(String name, double weight) {
		super(name);
		this.weight = weight;
		
	}
	@Override
	public double getCost() {
		return 0;
	}
	
	public double getRedPotato(){
		RedPotato rp=new RedPotato();
		System.out.println("Price per pound is $"+rp.getPricePerPound());
		return rp.getCost();
		
	}
	public double getWhitePotato(){
		WhitePotato wp=new WhitePotato();
		System.out.println("Price per pound is $"+wp.getPricePerPound());
		return wp.getCost();
	}
	public double getSweetPotato(){
		SweetPotato sp=new SweetPotato();
		System.out.println("Price per pound is $"+sp.getPricePerPound());
		return sp.getCost();
	}
	private class RedPotato{
		private final double pricePerPound=3.0;
		public double getCost() {
			return weight*pricePerPound;
		}
		public double getPricePerPound(){
			return pricePerPound;
		}
	}
	class WhitePotato{
		private final double pricePerPound=2.0;
		public double getCost() {
			return weight*pricePerPound;
		}
		public double getPricePerPound(){
			return pricePerPound;
		}
	}
	class SweetPotato{
		private final double pricePerPound=5.0;
		public double getCost() {
			return weight*pricePerPound;
		}
		public double getPricePerPound(){
			return pricePerPound;
		}
	}
	
	

}
