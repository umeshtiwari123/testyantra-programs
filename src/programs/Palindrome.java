package programs;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String original="";
		String reverse="";
		System.out.println("Enter The String: ");
		original=sc.nextLine();
		int length=original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
