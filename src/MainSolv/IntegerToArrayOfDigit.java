package MainSolv;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerToArrayOfDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter size of Array : ");
		int size = scan.nextInt();
		
		int[] digitArray = new int [size];
		
//		for (int i = 0; i < args.length; i++) {	
//		 digitArray[i] = scan.nextInt();
//		}
		System.out.println(" Enter digit for number integer : ");
		int number = scan.nextInt();
		
		
		int index=digitArray.length-1;
				while(number>0){
					int lastDigit = number%10;// mod 37465%10 === 5 is remaining
					digitArray[index]= lastDigit;
					number= number/10;// cuting last digit of number 37465/10 === 3746  
					 index--;
					
				}
		System.out.println(" Array is: "+Arrays.toString(digitArray));
		
		

	}

	private static Object digitNum(int number) {
		
		return null;
	}

}
