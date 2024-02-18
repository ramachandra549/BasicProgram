package chandu;

class LaptopDriver
{
	public static void main(String[]args)
	{
		Laptop l=new Laptop();
		Laptop l1=new Laptop("hp");
		Laptop l2=new Laptop(45000.0);
		Laptop l3=new Laptop(111327654);
		Laptop l4 = new Laptop("Dell "+44+" "+111111);
		
		System.out.println(l1.getModel());
		System.out.println(l2.getPrice());
		System.out.println(l3.getImeino());
		System.out.println(l4.getModel()+l4.getPrice()+l4.getImeino());
		
		l2.setPrice(46000);
		System.out.println(l2.getPrice());
		
	}
	
}


