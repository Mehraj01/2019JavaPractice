package MainSolv;

import java.util.Scanner;

public class FibonaccciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	}
	
	public static void fib(int num){
		
		int result =0;
		int first = 0;
		int second = 1;
		for( int i =0; i<num-1; i++){
			
			result= first+second;
			
			int temp1 = first;
			first=second;
			int temp2 = second;
			second=result;
		}
		System.out.println(result);
		
	}
//  int first = 0;
//   int second = 1;
// first+second= 1;
// second+1=2;
// f s result
// 0+1=1
// 1+1=2
// 1+2=3;
// 2+3=5
// 3+5=8
// 5+8=13
// 8+13=21
// 13+21=34

}
