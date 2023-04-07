package programs;


import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int firstTerm=0;
		int secondTerm=1;
		System.out.println("Enter the number of terms to print fiboncaaci: ");
		int n=sc.nextInt();
		System.out.println("Fibonacci Series from: "+n+" is : ");
		for(int i=1;i<=n;i++)
		{
			System.out.print(firstTerm+" ");
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
	}

}