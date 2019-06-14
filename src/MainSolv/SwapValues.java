package MainSolv;

import java.util.Arrays;

public class SwapValues {

	public static void main(String[] args) {
		int [] number = new int[]{1,2,3,4,5,6,7,8,9,};
		
		for(int i=0; i<number.length/2; i++){
			int temp = number[i];
			number[i]= number[(number.length-1)-i];
			number[(number.length-1)-i]=temp;
			
			//print only last indexes
			//System.out.print(number[i]);
		}
		
		//System.out.println(Arrays.toString(number));
		
		int x = 0,y=0;
		for(int i=0; i<number.length/2; i++){
			x=number[i];
			y=number[(number.length-1)-i];
			
			x=x+y;
			x=x-x;
			y=x-y;
			
		}
		
		System.out.println(Arrays.toString(number));
	}

}
