package point.of.sale;

public class IceCream extends RetailItem {

	public IceCream(String name) {
		super(name);
		
	}

	@Override
	public double getCost() {
		return 0;
	}
	public double getChocolate(){
		Chocolate c=new Chocolate();
		return c.getCost();
	}
	public double getVanilla(){
		Vanilla v=new Vanilla();
		return v.getCost();
	}
	public double getStrawberry(){
		Strawberry s=new Strawberry();
		return s.getCost();
	}


	class Chocolate {

		public double getCost() {

			return 2.0;
		}
	}
	class Vanilla {

		public double getCost() {

			return 4.0;
		}
	}

	class Strawberry {

		public double getCost() {

			return 7.0;
		}
	}
	
}
