package MainSolv;

public class CreatArray {

	public static void main(String[] args) {
		
		
		
		// 1 st way 
		String[] animals1 = new String[5];
		animals1[0]="dog";
		animals1[1]="cat";
		animals1[3]="duck";
		animals1[3]="deer";
		animals1[4]="bear";
		
		
		
		// 2nd Way to create array
		String [] animals2 = {"dog","cat","duck","deer","bear"};
		animals2[0]= "dog";
		animals2[1]="cat";
		
		
		
		
		
		//3rd way 
		String [] animals3;
		
		          animals3 =new String[] {"dog","cat","duck","deer","bear"};
		          
		          
		//you cant assigined it like this
		          
		          //animals3 ={"dog","cat","duck","deer","bear"};
		
		// diferent  data type arrays
		          
		          boolean[] onOf;
		                    onOf = new boolean[]{true,false,};
		          char [] letter;
		                  letter = new char[]{'a','ƒ','®'};
		          int [] number;
		                 number = new int[]{1,2,3,4,5,6,7,8,9,0};
		          float [] size;
		                   size= new float[]{ (float) 3.23,(float) 3.2,2,4,6,8,9,5};
		                    float[] size2= {(float) 2.1} ; 
		                   
		          double [] distance;
		                    distance= new double[]{1.2, 2.3, 3.4,5.3,9.56};
		          byte [] bit ;
		                  bit= new byte []{4, 8,16,32,64};
		
		                    System.out.println(distance[4]);
		
		

	}

}
