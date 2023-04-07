package programs;


import java.util.Scanner;

public class StringOccurence {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter The String: ");
String s=sc.nextLine();
System.out.println("Enter The character you want to search in this string: ");
char ch=sc.next().charAt(0);
int count=0;
for(int i=0;i<=s.length()-1;i++)
	{
		if(s.charAt(i)==ch)
		{
				count++;
		}
	}
System.out.println("The number of: "+ch+" in the given string: "+s+" is: "+count);
	}
}