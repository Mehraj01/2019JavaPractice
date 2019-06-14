package MainSolv;

public class CharArraytoString {

	public static void main(String[] args) {
		
		
		char[] name= {'M','e','h','r','a','j'};
		
		String myName= new String(name);
		System.out.println(myName);
		
		
		////////////////////////////////////
		
		
		String myName2="";
		for(int i=0; i<name.length; i++){
			myName2= myName2+name[i];
			
		}
		System.out.println(myName2);

	}

}
