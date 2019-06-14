package MainSolv;

import java.util.Arrays;

public class CharArrayToStrings {

	public static void main(String[] args) {
		
		String state = "Massachusets";
		
		char [] letters = state.toCharArray();
		System.out.println(Arrays.toString(letters));
		
		
		/////////Changing  char array  to string with for loop//////
		
		String str= "";
		for(int i= 0; i< letters.length; i++){
			str= str+letters[i];
		}
		
		System.out.println(str);
		
		////////////////Char array to string /////////////
		
	String str1 = new String (letters);
	System.out.println(str1);

	}

}
