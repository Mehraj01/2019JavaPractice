package MainSolv;

import java.util.Scanner;

public class INtPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		
		System.out.println(integrPalindrome(num));
		
		}
	
	public static boolean integrPalindrome(int num){
		
		int reversINt =0;
		int count=0;
		int num1=num;
		while(num>0){
			
			int lastDigit=num%10;
			reversINt= reversINt*10+lastDigit;
			num=num/10;
			
			count++;
			
		}
		if(num1==reversINt)	
		return true;
		else
		return false;
		
		
	}

}
