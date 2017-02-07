package point.of.sale;

import java.util.Scanner;

public class PointOfSale {

	public static void main(String[] args) {
		
		
		String retailItem;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the name of the item you would like to purchase from the following list:\nPotatoes\nEggs\nIceCream\nSundae");
		retailItem=input.next();
		
		if(retailItem.equalsIgnoreCase("Potatoes")){
			System.out.println("Please enter\n1 for Red Potatoes\n2 for White Potatoes\n3 for Sweet Potatoes");
			int potatoType=input.nextInt();
			
			switch (potatoType) {
			case 1:
				System.out.println("Please enter the weight in lbs\n");
				double in1=input.nextDouble();
				RetailItem rp=new Potatoes("Red Potatoes",in1);
				System.out.printf("Your cost for %s is $%s","Red Potatoes",rp.getRedPotato());
				break;
			case 2:
				System.out.println("Please enter the weight in lbs\n");
				double in2=input.nextDouble();
				RetailItem wp=new Potatoes("White Potatoes",in2);
				System.out.printf("Your cost for %s is $%s","White Potatoes",wp.getWhitePotato());
				break;
			case 3:
				System.out.println("Please enter the weight in lbs\n");
				double in3=input.nextDouble();
				RetailItem sp=new Potatoes("Sweet Potatoes",in3);
				System.out.printf("Your cost for %s is $%s","Sweet Potatoes",sp.getSweetPotato());
				break;
			default:
				System.out.println("Your selection is invalid");
				break;
			}
			
		}else if(retailItem.equalsIgnoreCase("Eggs")){
			System.out.println("Please enter the number of eggs");
			int n=input.nextInt();
			RetailItem eggs=new Eggs("Eggs",n);
			System.out.printf("Your cost for %s is $%s","Eggs",eggs.getCost());
			
			
			
		}else if(retailItem.equalsIgnoreCase("IceCream")){
			System.out.println("Please enter\n1 for Chocolate\n2 for Vanilla\n3 for Strawberry");
			int iceCreamType=input.nextInt();
			
			switch (iceCreamType) {
			case 1:
				RetailItem ch=new IceCream("Chocolate Icecream");
				System.out.printf("Your cost for %s is $%s","Chocolate Icecream",ch.getChocolate());
				break;
			case 2:
				RetailItem va=new IceCream("Vanilla Icecream");
				System.out.printf("Your cost for %s is $%s","Vanilla Icecream",va.getVanilla());
				break;
			case 3:
				RetailItem sb=new IceCream("Strawberry Icecream");
				System.out.printf("Your cost for %s is $%s","Strawberry Icecream",sb.getStrawberry());
				break;
			default:
				System.out.println("Your selection is invalid");
				break;
			}
			
			
		}else if(retailItem.equalsIgnoreCase("Sundae")){
			System.out.println("Please enter\n1 for Chocolate Sundae\n2 for Vanilla Sundae\n3 for Strawberry Sundae");
			int iceCreamType=input.nextInt();
			
			switch (iceCreamType) {
			case 1:
				RetailItem ch=new Sundae("Chocolate Sundae");
				System.out.printf("Your cost for %s is $%s","Chocolate Sundae",ch.getChocolateSundae());
				break;
			case 2:
				RetailItem va=new Sundae("Vanilla Sundae");
				System.out.printf("Your cost for %s is $%s","Vanilla Sundae",va.getVanillaSundae());
				break;
			case 3:
				RetailItem sb=new Sundae("Strawberry Sundae");
				System.out.printf("Your cost for %s is $%s","Strawberry Sundae",sb.getStrawberrySundae());
				break;
			default:
				System.out.println("Your selection is invalid");
				break;
			}
			
			
		}
		input.close();
	}

}
