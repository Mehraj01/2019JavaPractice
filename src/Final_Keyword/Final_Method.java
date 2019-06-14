package Final_Keyword;

public class Final_Method {
	
	public int num = 4;
	public  static int age = 8;
	public  final int number ;
	
	public Final_Method(int num, int age, int number) {
		
		this.num =num;
		this.age = age;
		this.number=number;
		
	}

	public final void makePhoneCall(String phoneNumber){
		System.out.println("DIal number"+ phoneNumber+"\n Press On Call");
	}
	
	public static final  void readMessage(String sender){
		System.out.println("Read message"+ sender);
	}
}

class Sub extends Final_Method{
	/*
	 * can not override final method
	 */
	
//	public  void makePhoneCall(String phoneNumber){
//		System.out.println("DIal number"+ phoneNumber+"\n Press On Call");
//	}
	
	
	public Sub(int num, int age, int number) {
		super(num, age, number);
		// TODO Auto-generated constructor stub
	}

	//Final method can be Overloading 
	// Since it is new method
	public final void makePhoneCall(String phoneNumber, int num){
		System.out.println("DIal number"+ phoneNumber+"\n Press On Call");
	}
	
//	@Override
//	public static final void readMessage(String sender){
//		//System.out.println("Read message"+ sender);
//	}
	
}