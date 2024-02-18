package chandu;

import java.util.Scanner;

public class Conditions {

	public static void main(String args[]) {
		
//....Nested if else condition...	
/*
	int day=7;
	
	if (day==1)
			{
		System.out.println("Monday");
			}
	else if (day==2)
	{
		System.out.println("Tuesday");
	}
	else if (day==3)
	{
		System.out.println("Wednesday");
	}
	else if (day==4)
	{
		System.out.println("Thursday");
	}
	else if (day==5)
	{
		System.out.println("Friday");
	}
	else if (day==6)
	{
		System.out.println("Saturday");
	}
	else if (day==7)
	{
		System.out.println("Sunday");
	}
	else
	{
		System.out.println("ivalid week day");
	}
	
*/	
// ....Switch Case....
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Date :");
	int day=sc.nextInt();
	
	switch(day)
	{
	case 1: System.out.println("monday"); break;
	case 2: System.out.println("tuesday");  break;
	case 3: System.out.println("wednesday"); break;
	case 4: System.out.println("thursday"); break; 
	case 5: System.out.println("friday");  break;
	case 6: System.out.println("satday"); break; 
	case 7: System.out.println("sunday"); break;
	default:System.out.println("invalid week num");
	
	}
	
	}

}
