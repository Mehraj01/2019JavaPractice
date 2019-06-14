package Final_Keyword;

public class FINAL_KEYWORD {
	
	
	private static final  String SCHOOL_NAME="Cybertek" ;
	
	private final int NUM1;
	//NUM1 = 1; not works
	
	private static final int NUM2;
	
	private static int num;
	
	private  int num1;
	
	
	{
		
		//NUM1 = 1;
		num =1;
		
		
		//NUM2=19;not works
	}
	
	
	static{
		//NUM1 =12;must be static not works
		
		NUM2 = 3;
		System.out.println(NUM2);
		num=3;
		//num1 =1;  non static variable can not declare in static block
	}
	
	public FINAL_KEYWORD() {
		num=5;
		num1 =31;
		num1 =13;
		//NUM2 =22; not works
		NUM1 =12;
	}
	 public static void name(){
		 //NUM2 = 34; not works
		 System.out.println(NUM2);
		 num = 5;
	 }
	
	public void number(){
		// NUM1 =12; final can not assign in method 
		num=5;
		//NUM2 = 34; not works
		System.out.println(NUM2);
	}

	public static void main(String[] args) {
		//NUM2 =23;not works
		int f=3;
		num=9;
		//num1= 28; static method not accepts non static field
		final int MAX ;
		MAX =10;
		System.out.println(num);
		//System.out.println(num1);
		
		 final int x =3;
		 FINAL_KEYWORD f1 = new FINAL_KEYWORD();
		 
		 System.out.println(f1.num1 );
		
		 System.out.println(NUM2);
		 
		

	}

}
