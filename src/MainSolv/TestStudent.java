package MainSolv;

import java.lang.reflect.*;

public class TestStudent {

	public static void main(String[] args) throws Exception {
		
		int count =0;
		Class c = Class.forName("day46.FlyiingCar");
		Method [] m = c.getDeclaredMethods();
		for(Method m1 : m){
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("number of methods in package"+count);
		
		

	}

}
