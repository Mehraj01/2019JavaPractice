package MainSolv;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		String name = "Mehraj";
		
		char[] letters =new char[name.length()];
		
		for (int i= 0; i<letters.length; i++){
			letters[i]=name.charAt(i);
			
		}
		
		
		
		
		
		System.out.println(Arrays.toString(letters));
		
		
		////////////////USING METHODS///////////////////////////////////////
		char[] word = name.toCharArray();
		System.out.println(Arrays.toString(word));
		
		
		
		
	             

	}

}
