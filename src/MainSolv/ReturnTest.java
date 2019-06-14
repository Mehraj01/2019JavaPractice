package MainSolv;

public class ReturnTest {
	

	public static void main(String[] args) {
		
		System.out.println(ReturnTest.isTitleWord("near"));
		

	}
	
	
	public static Boolean isTitleWord(String word) {
		String [] arr = {"a" , "an", "the"};
		String [] conj = {"and", "but", "for", "nor", "or", "so", "yet"};
		String [] prep = {"at", "by", "in", "into", "near", "of", "on", "to", "than", "via"};
		for(String each : arr){
		  if( word.equals(each))
		  return false;
		}
		for(String each : conj){
		  if( word.equals(each))
		  return false;
		}
		for(String each : prep){
		  if( word.equals(each))
		  return false;
		}
		
    	
    	return true;
        
    }

}
