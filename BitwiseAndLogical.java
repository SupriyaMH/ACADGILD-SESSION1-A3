package assignments;

import java.util.Scanner;

public class BitwiseAndLogical {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		//bitwise AND operator
		int d=a&b;
		System.out.println(d);
		
		
		
		System.out.println("logical AND operator output for given is:" +((a>b)&&(a>c)));
	

	}

}
