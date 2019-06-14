package MainSolv;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FromArrayToString {

	public static void main(String[] args) {
		String[] dcComicHeros = {"Superman ",
	            "Batman ",
	            "Aquaman ",
	            "WonderWoman ",
	            "TheFlash "
	            ,"GreenLantern ",
	            "Vasyl"
	          } ;  
		
		// Using for each loop to change Array to String
		
		for(String heros : dcComicHeros){
			System.out.print(heros);
		}
		System.out.println();
		
		///////////////////////////////////////////////////////
		
		int[] number= {1,2,3,5,6,3,9,0,65,54,98};
		System.out.println(Arrays.toString(number));
		for(int diffNums : number){
			System.out.print(diffNums);
		}
		System.out.println();
		
		double[] size = { 1.1,2.1,9.99,4.76};
		System.out.println(Arrays.toString(size));
		for(double dbl : size){
			System.out.println(dbl);
		}

	}
	

}
