package chandu;

import java.util.Scanner;

public class MaxAndMinArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=s.nextInt();
		System.out.println("Enter the Array Element");
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			else if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
