package MainSolv;

import java.util.Scanner;

public class ShoppingLIst {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		
		int count = 2;
		double totalPrice = 0;
	
		
		System.out.println("Enter Item1" +  " and its price:");
		item = scan.nextLine();
		double price  = scan.nextDouble();
		shoppingListReport = " item1" + ": "+ item + " Price: " + price;
		do{ 
			
			
			
			scan.nextLine();
		System.out.println("Add one more item?");
		  countinue=scan.nextLine();
		  //scan.nextLine();
		
		
		if(countinue.equals("yes")){
			
			System.out.println("Enter Item" + count + " and its price:");
			item = scan.nextLine();
			price = scan.nextDouble();
		
			shoppingListReport += " item" + count + ": "+ item + " Price: " + price;
			totalPrice=totalPrice+price;
		}else if(countinue.equals("no")) {
			System.out.println(shoppingListReport);
			System.out.println("Total price: " + totalPrice);
			break;
		}
		
		count++;
	  }while(count<=10);

	}

}
