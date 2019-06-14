package MainSolv;

import java.util.Arrays;

public class SortingTheArray {

	public static void main(String[] args) {
		String[] dcComicHeros = {"Superman",
	            "Batman",
	            "Aquaman",
	            "Wonder Woman",
	            "The Flash"
	            ,"Green Lantern",
	            "Vasyl"
	          } ;  
		
		Arrays.sort(dcComicHeros);
		
		System.out.println(Arrays.toString(dcComicHeros));

	}

}