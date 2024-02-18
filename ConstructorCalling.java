package chandu;
import java.util.Scanner;
public class ConstructorCalling
{
	
	
	public static void main(String[] chandu)
	{ 
		Chandu c=new Chandu();
		Chandu c1=new Chandu("chandu");
		System.out.println(c1.name);
		c.show();
	}
}
class Chandu
{
	 String name;
	Chandu()
	{
		
		
	}
	Chandu(String name)
	{
		this.name=name;
	}
	void show()
	{
		System.out.println("chandu");
	}
	
}
