package MainSolv;

import java.util.Arrays;
import java.util.Scanner;

public class ZombiAttack {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[]{3,6,0,4,3,2,7,1};
		    for(int i=0; i<inhabitants.length; i++) {
		     //inhabitants[i] = input.nextInt();
		    }
		    
		    //TODO. Write you code below this line.
		    
		    int max = inhabitants[0];
		    for(int x=0; x<inhabitants.length; x++){
		      if (inhabitants[x]>max){
		        max=inhabitants[x];
		        
		      }
		    }
		    //System.out.print(max);
		    

		    int day=0;
		    do{
		      
		    System.out.print("Day "+day);
		    System.out.println(Arrays.toString(inhabitants));
		   for(int i=0; i<inhabitants.length; i++){
		      
		        inhabitants[i]/=2;
		      }
		       day++;
		       
		    max--;
		    }while(max>0);
		     
		   
		     
		     //System.out.println("Day"+j+Arrays.toString(inhabitants));
		  
		     
		    
		   
		  

	}

}
