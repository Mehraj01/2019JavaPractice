package MainSolv;

public class task {

	public static void main(String[] args) {
		String target = "blablaaa";
		String word ="f";
		String a = at3(target,word);
		System.out.println(a);
		
		System.out.println(clean("one two", "two"));


	}
	public static String at3(String target,String word)
	  {
	    String a ="";
	    for ( int i =0; i<3; i++){
	      a=a+ target.charAt(i)+"";
	    
	    }
	    a= a+word+target.substring(3);
	    
	    return a;
	  }
	 public static String clean (String text ,String badWord) {

	      String [] word= text.split(" ");
	      String target ="";
	      for(int i =0; i<word.length; i++){
	      
	      if (!word[i].equals(badWord) ){
	        target= target+word[i]+" ";
	        
	      }
	      }
	      return target;
	  }

}
