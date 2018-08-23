
public class Product {
	
	private double price;
	private int id;
	private int quant;
	
	
	
	public Product(double price, int id, int quant) {
		
		this.price = price;
		this.id = id;
		this.quant = quant;
		
	}



	public double getPrice() {
		return price;
	}

	public int getId() {
		return id;
	}
	
	public int getQuant() {
		return quant;
	}
	
	public void incrQuant(int quant)
	{
		this.quant = this.quant + quant;
	}

	public void decrQuant(int quant)
	{
		this.quant = this.quant - quant;
	}

	public void incrPrice(double price)
	{
		this.price = this.price + price;
	}

	public void decrPrice(double price)
	{
		this.price = this.price - price;
	}

	public double getNetPrice()
	{
		return this.quant * this.price;
	}

	
	
	
	
	

}
