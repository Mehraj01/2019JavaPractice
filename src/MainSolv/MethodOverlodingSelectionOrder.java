package MainSolv;

public class MethodOverlodingSelectionOrder {

	public static void main(String[] args) {
		doSomething(10);

	}
//	public static void doSomething(int x){
//		System.out.println("do something (int x)");
//	}
//	public static void doSomething(long x){
//		System.out.println("do something (long x)");
//	}
//	public static void doSomething(Integer x){
//		System.out.println("do something (Integer x)");
//		
//	}
	public static void doSomething(int...x){
		System.out.println("do something (int...x)");
	}

}
