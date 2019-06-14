package MainSolv;

import java.util.ArrayList;
import java.util.Random;

public class MethodReturnArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>randomList=intList(5); 
	System.out.println(intList(5));
	
	System.out.println(sum(intList(5)));

	}
	public static ArrayList<Integer>intList(int a){
		Random ran = new Random();
		 
		
		ArrayList<Integer>intList=new ArrayList<>();
		for(int i=1; i<=a; i++){
			intList.add(ran.nextInt(101));
		}
		
	
		
		return  intList;
		
	}
	public static int sum (ArrayList<Integer>sumList){
		int sum=0;
		for(int d :(sumList) )
		sum+=d;
		return sum;
	}
	

}
