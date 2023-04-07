package programs;

import java.util.Arrays;
import java.util.Scanner;
	
	

	public class MinAndMax {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array: ");
	int size=sc.nextInt();
	System.out.println("Enter the array elements: ");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++)
	{
				a[i]=sc.nextInt();
	}
	Arrays.sort(a);
System.out.println("The Minimum Element in the array is: "+a[0]);
System.out.println("The Maximum Element in the array is: "+a[a.length-1]);
		}

	}

