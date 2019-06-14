package MainSolv;
import java.util.*;

public class FindUniqueChar {




  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int[] nums = new int[size];
    for(int i=0; i < size; i++){
      nums[i] = scan.nextInt();
    }
    
    printUniqueNumbers(nums);
   
  }
  
  public static void printUniqueNumbers(int[] nums){
    //WRITE YOUR CODE HERE
    int z =0;
  
    
   
     for ( int i =0 ; i<nums.length;  i++){
    	 int count=0;   // count must be inside the loop that to start again
      for ( int x =0 ; x<nums.length;  x++){
    	 
        if( nums[i]!=nums[x])
          count++;
        System.out.println(count+"**");
     
      }
     
       if(count ==nums.length-1 ){
       
      System.out.println(nums[i]);
      
       }
      
   //System.out.println(count);
     }
     
   
    
     
  }
}
