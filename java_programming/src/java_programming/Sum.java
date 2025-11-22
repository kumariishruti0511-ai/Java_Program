package java_programming;

import java.util.Scanner;

public class Sum {

	public void sumNumber(int a, int b) {
		int s;
		s=a+b;
		System.out.println("Sum of two number= "+s);
	}
	public static void main(String[] args) {
		Sum obj=new Sum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		obj.sumNumber(a, b);
	}

}
