package programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int pw=1;
		for(int i=1;i<=n;i++)
		{
			pw*=i;
		}
		System.out.println("The factorial of "+n+" is : "+pw);
	}

}