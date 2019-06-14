package day24;

import java.util.Scanner;

public class ListoOfNonNegaativeInts {

	public static void main(String[] args) {
		
		int []list = new int [10];
		Scanner scan =new Scanner(System.in);
		
		int number = scan.nextInt();
		int i=0;
		while((number>=0)&& (i<list.length)){
			list[i]=number;
			i++;
			number = scan.nextInt();
		}
		if(number>=0){
			System.out.println(" only+"+list.length);
		}
		
		

	}

}
