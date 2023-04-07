package programs;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String original="";
		String reverse="";
		System.out.println("Enter the String: ");
		original=sc.nextLine();
		int length=original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
		}
		System.out.println("The Reverse Of: "+original+" is: "+reverse);
	}

}