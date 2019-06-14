package MainSolv;

import java.util.Arrays;

public class SplitTheStringChangetoArray {

	public static void main(String[] args) {
		
		//////////// Changing String to String array with split metod//////////
		 String grocerry= "apple, salt, butter, friuts, bread, cheese, honey, cereal";
		 
		 
			
		 
		 String [] arr = grocerry.split(", ");
		 
				 System.out.println(Arrays.toString(arr));
				 
				////// Counting Items in String groccery ///////////////// 
				int count=0;
				for(int i= 0 ; i<grocerry.length(); i++){
					if (grocerry.charAt(i) == ','){
						
						count++;
					}
				}
				System.out.println(count);
				
				
		//////////////Count of items in array/////////		
				int count1=0;
				for(int i =0 ; i<arr.length; i++){
					count1++;
				}
				System.out.println(count1);
				
				
	/////////////////last item in Array///////
				
				System.out.println(arr[arr.length-1]);
				System.out.println(arr[arr.length/2]);
				
		//////////length of item in arr array////////////
				int count2=0;
				for(int i = 0 ; i<arr.length; i++){
				count2++;
				System.out.println(count2+".  "+arr[i]+"'s length is  "+arr[i].length());
				
				}
				
				
				String name = "java is fun";
				
				String [] name1 = name.split(" ");
				System.out.print(Arrays.toString(name1));
				
			
	
				

	}

}
