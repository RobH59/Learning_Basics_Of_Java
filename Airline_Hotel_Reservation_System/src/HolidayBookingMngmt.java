
public class HolidayBookingMngmt {
	
public static void main(String[] args) {
		
	
	
	OrderTransPortDTA p1 = new OrderTransPortDTA(1250, 1, 1, "Business");
	OrderTransPortDTA p2 = new OrderTransPortDTA(475, 2, 1, "1st");
	OrderTransPortDTA p3 = new OrderTransPortDTA(190, 3, 1, "2nd");
	
	
	
	
	Bookings i = new Bookings();
	i.addProduct(p1);
	i.addProduct(p2);
	i.addProduct(p3);


	
	i.incrQntyPrdct(p1.getId(), 1);
	i.incrPricePrdct(p3.getId(), 140);



	i.showInventory();
	
	
	
}
	

}
