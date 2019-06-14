package MainSolv;

import java.text.DecimalFormat;
import java.util.Arrays;

public class MAXandMINvalue {

	public static void main(String[] args, Object DecimalFormat) {
		String[] cours = { "Welcome ", "Java Program", "Software", " Development "};
		///////FIND MAX value of Array/////////
		
		int max = cours[0].length();
		for (int i = 0; i < cours.length; i++) {
			
			if (cours[i].length()>max){
				max=cours[i].length();
				
			}
		}
		System.out.println(max+" is max value of cours array");
		
		/////////////FinD MIN value of Array/////////////////
		
		int min= cours[0].length();
		for (int i = 0; i < cours.length; i++) {
			if (cours[i].length()<min)
		       min= cours[i].length();
		}
		System.out.println(min+" is min value of cours array");
		
		
         //////////////////////////////////////
		
		
		int [] nums = {1,4,6,8,6,4,6,7,9};
		
		int maxi = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>maxi){
			maxi=nums[i];
			}
		}
			
		System.out.println(maxi+" is max value of nums array");
		
		
		////////////////////////////////////////////////////
		
		int[] number = {3,4,2,5,3,4,5,6,8,9};
		int max1 = number[0];
		for(int num1 : number){
			System.out.print(num1);
			
			
		}
		 
		
	}

}
