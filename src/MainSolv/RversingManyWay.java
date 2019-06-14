package MainSolv;

import java.util.Arrays;

public class RversingManyWay {

	public static void main(String[] args) {
	String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		 
		
		// String to String Array
		String [] cybertek = str.split(" ");
		//////////////////reversing with two char array//////////////////
//		// reversing the sentences 
//		for(int i = cybertek.length-1; i>=0; i--){
//			
//			// create String word
//			String wordString = cybertek[i];
//			
//			// Creating Char Array from String word
//			char[] wordChar = wordString.toCharArray();
//			//System.out.println(Arrays.toString(wordChar));
//			
//			//Reversing Char Array
//			for(int j = wordChar.length-1; j>=0; j--){
//				System.out.print(wordChar[j]);
//				
//			}
//			System.out.println();
//		}
//		//////////////////////////REVERSING LIKE STRING////////////////////
//		char reverse = 0;
//		for(int i = cybertek.length-1 ; i>=0; i--){
//			String cyberWord = cybertek[i];
//			for(int j = cyberWord.length()-1 ; j>=0; j--){
//				 reverse = cyberWord.charAt(j);
//				
//				 System.out.print(reverse);
//			}
//			System.out.print(" ");
//			
//		}
		////////////////////////REVERSING with SWAP method////////////////////////////////////
		
//		for(int i=0 ; i<cybertek.length/2; i++){
//			String temp = cybertek[i];
//			 cybertek[i]=  cybertek[ cybertek.length-1-i];
//			 cybertek[ cybertek.length-1-i]= temp;
//			
//			 
//			
//		}
		String empty ="";
		
		for(int i =0; i<cybertek.length; i++){
			String wordRev = cybertek[i];
			char[] revArr = wordRev.toCharArray();
			System.out.print(Arrays.toString(revArr)+" -ReversE- ");
			 
			//System.out.println();
			
			for(int j =0 ; j<revArr.length/2; j++){
				
				char temp =revArr[j];
				revArr[j] =  revArr[revArr.length-1-j];
				revArr[revArr.length-1-j]= temp;
				
				
			}
			
			///.//// Change CHAR ARRAY to String
			
			String words = new String(revArr);
			System.out.print(words+" ");
			System.out.println(Arrays.toString(revArr));
			
			
			//////lets write it as sentence with creating emty String and ading words in empty//////////////// 
			empty+=words+" ";
		}
		
		System.out.println(empty);


	}

}
