package java_programming;

import java.util.Scanner;

public class Sum {

	public void sumNumber(int a, int b, int c) {
		int s;
		s=a+b+c;   
		
		System.out.println("Sum of three number= "+s);
	}
	public void sub(int a,int b) {
		int s;
		s=a-b;
		System.out.println("Sub="+s);
	}
	public static void main(String[] args) {
		Sum obj=new Sum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		obj.sumNumber(a, b,c);
		obj.sub(a, b);
	}

}
