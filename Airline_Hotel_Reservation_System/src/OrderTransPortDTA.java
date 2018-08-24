
public class OrderTransPortDTA {
	
	
	
	private double price;
	private int transportid;
	private String transportClas;
	private int quant;
	
	
	
	public OrderTransPortDTA(double price, int transportid, int quant, String transportClas) {
		
		this.price = price;
		this.transportid = transportid;
		this.transportClas = transportClas;
		
	}
	
	public double getPrice() {
		return price;
	}

	public int getId() {
		return transportid;
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
	public String getTransportClas() {
		return transportClas;
	}

}
