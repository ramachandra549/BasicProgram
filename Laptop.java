package chandu;

public  class Laptop
{
	private String model;
	private double price;
	private long imeino;
	
	
	Laptop()
	{
		
	}
	Laptop(String model)
	{
		this.model=model;
	}
	Laptop(double Price)
	{
		this.price=price;
	}
	Laptop(long imeino)
	{
		this.imeino=imeino;
	}
	Laptop(String model,double price,long imeino)
	{	
		this(model);
		this.price=price;
		this.imeino=imeino;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getImeino() {
		return imeino;
	}
	public void setImeino(long imeino) {
		this.imeino = imeino;
	}
	
	
}
