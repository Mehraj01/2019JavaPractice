package MainSolv;

import java.util.*;

public class ArrayListPractic {

	public static void main(String[] args) {
		
		ArrayList<String>lst=new ArrayList<>();
		
		List<String>lst2=new ArrayList<>();
		
		lst.add("banana");
		lst.add("tomato");
		lst.add("carrot");
		lst.add("mango");
		lst.add("orange");
		System.out.println(lst);
		// how many item in list (size of arrayList)
		int  e = lst.size();
		System.out.println(e);
		//update an item
		lst.set(1, "cucumber");
		System.out.println(lst);
		////insert an item 
		lst.add(1, "melon");
		System.out.println(lst);
		
	     ///check excist or not	
		boolean haveMilkOrNot = lst.contains("Milk");
		System.out.println(haveMilkOrNot);
		// check location of certain list
		int indexOfOrange= lst.indexOf("orange");
		System.out.println("index of orange..."+indexOfOrange);
		
		//remove method with item name
		lst.remove("mango is removed....."+"mango");
		System.out.println(lst);
		//     remove with index "index has to be in range"
		lst.remove(3);
		System.out.println("carrot in 3rd index removed....."+lst);
	// delating all from array list
		//lst.clear();
		//System.out.println(lst);
		// check empty or not
		boolean b=lst.isEmpty();
		System.out.println(b);
		
		for (int i = 0; i < lst.size(); i++) {
			
			System.out.print(lst.get(i)+"--");
			
		}
		System.out.println();
		
		for(String each : lst){
			System.out.print("\"\""+each);
		}

	}

}
