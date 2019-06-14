package Final_Keyword;

public final class Final_Class extends Final_Method {
	

	public Final_Class(int num, int age, int number) {
		super(num, age, number);
	}



	public int age=100;
	
	
	
public static void main(String[] args) {
	Final_Method fin =new Final_Method(2,4,6);
	
	Final_Class c =new Final_Class(3,6,9);
	System.out.println(c.toString());
	
	
	System.out.println(fin.number);
	
	
}
}
