package chandu;
import java.util.Scanner;

 class AddingArrayElements
 {
	 static Scanner sc =new Scanner(System.in);
	 
	public static void main(String[]args)
	{



//Example:Array
		
		System.out.println("Enter size ");
		int size=sc.nextInt();
		System.out.println("Enetr the Elements ");
		int a[]=new int[size];
		
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			//System.out.println(a[i]);
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	
	}
}

