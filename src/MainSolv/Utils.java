package MainSolv;

public class Utils {
	
		  public   String reverseLetters(String word){
				//TODO
			  String str="";
				char [] c= word.toCharArray();
				for(int i = 0; i<c.length/2; i++){
				  for(int j = (c.length-1)/2; j>0; j--){
					  
					  
				    if (Character.isLetter(c[i])&& Character.isLetter(c[j])){
				    char temp = c[j];
				    c[j] = c[i];
				    c[i] = temp;
				    	
				    }
				    
				    
				    
				    
				    
				    
				    
				  }
				}
				 str = new String(c);
				
				
				return str;
			}
		  public static void main(String[] args) {
			  Utils a = new Utils();
			  System.out.println("..zxc..v..d");
			  System.out.println("..dvc..x..z");
			  System.out.println(a.reverseLetters("..zxc..v..d"));
			  System.out.println("---olkmb.a-");
			  System.out.println(a.reverseLetters("---olkmb.a-"));
		  }
//		  
//		  public static void main(String[] args) {
//			   
//			    String result = Utils.reverseLetters("..zxcv..d");
//			    System.out.println(result.equals("..dvcx..z")); //true
//			    
//			    String result2 = Utils.reverseLetters("---abmkl.o-");
//			    System.out.println(result2.equals("---olkmb.a-")); //true
//			    
//			    String result3 = Utils.reverseLetters("---abmkl.o-");
//			    System.out.println(result3.equals("-o.lkmba---")); //false
//			  }
		}

