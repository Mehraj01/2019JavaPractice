package MainSolv;

import java.util.ArrayList;

public class MergeArraysList {

	public static void main(String[] args)
	{
		MergeArraysList m = new MergeArraysList();
	  ArrayList<Integer> arr = new ArrayList<>();
	  arr.add(1);
	  arr.add(5);
	  arr.add(3);
	  arr.add(7);
	  //System.out.println(arr);
	  ArrayList<Integer> arr1 = new ArrayList<>();
		System.out.println(m.twoTimes(arr));
		
	}
	//create your method below
	
	public ArrayList<Integer> twoTimes(ArrayList<Integer> arr){
	  ArrayList<Integer> newArr = new ArrayList<>();
	ArrayList<Integer> newArr1 = new ArrayList<>();
	
	  for(int i =0; i< arr.size(); i++){
	    newArr.add(arr.get(i));
	     
	  }
	  
	   for(int i =0; i< arr.size(); i++){
	     
	     newArr1.add(arr.get(i));
	     newArr1.add(newArr.get(i));
	   }
	   
	  
	  
	 return newArr1;
	}
	
	

}
