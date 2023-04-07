package programs;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("Not a prime Number");
		}
		
	}

}