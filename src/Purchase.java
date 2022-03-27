import java.time.LocalDateTime;

public class Purchase {

	private Cart cart;
	private LocalDateTime date;
	private double TotalDiscount;
	private double SubTotal;
	private double Total;
	public Purchase()
	{
		
	}
	public Purchase(LocalDateTime date, Cart cart)
	{
		this.date=date;
		this.cart=cart;
	}
	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public double FirstDiscount()
	{
		double sum=0;
		double disc=0;
		double localvalue=0;
		for(Product p:cart.getProducts())
		{
			sum+=p.getPrice();
			p.setamountOfDiscount(p.getPrice()*20/100);
			disc+=p.getamountOfDiscount();
			p.DiscountPerc=20;
		}
			SubTotal=sum; //sum of all products
			TotalDiscount=disc;
			localvalue=sum-TotalDiscount;
		return localvalue;
	}

	public double SecondDiscount()
	{
		double localvalue=0;
		double suma=0;
		for(Product p:cart.getProducts())
		{
			if(p instanceof Shirts)
			{
				double dis=p.getPrice()*10/100;
				TotalDiscount+=dis;
				localvalue=p.getPrice()-dis;
				suma+=localvalue;
				p.setDiscountPerc(10);
				SubTotal+=p.getPrice();
				p.setamountOfDiscount(p.getPrice()*10/100);
			}
			else if(p instanceof Shoes)
			{
				double dis=p.getPrice()*25/100;
				TotalDiscount+=dis;
				localvalue=p.getPrice()-dis;
				suma+=localvalue;
				SubTotal+=p.getPrice();
				p.setDiscountPerc(25);
				p.setamountOfDiscount(p.getPrice()*25/100);
			}
				
		}
		return suma;
	}
	
	public double FinalValue()
	{
		double suma=0;
		double localvalue=0;
		for(Product p:cart.getProducts())
		{
			if(p instanceof Shoes)
			{
				double dis=p.getPrice()*25/100;
				TotalDiscount+=dis;
				localvalue=p.getPrice()-dis;
				suma+=localvalue;
				SubTotal+=p.getPrice();
				p.setDiscountPerc(25);
				p.setamountOfDiscount(p.getPrice()*25/100);
			}
			else
			{
				double dis=p.getPrice()*20/100;
				TotalDiscount+=dis;
				localvalue=p.getPrice()-dis;
				suma+=localvalue;
				SubTotal+=p.getPrice();
				//Discount=20;
				p.setDiscountPerc(20);
				p.setamountOfDiscount(p.getPrice()*20/100);
			}
		}
		return suma;
	}
	
	public double Total()
	{
		double vrednost=0;
		if(cart.getProducts().size()>=3 && date.getDayOfWeek().name()!="TUESDAY")
		{
			vrednost=FirstDiscount();
		}
		else if(cart.getProducts().size()<3 && date.getDayOfWeek().name()=="TUESDAY")
		{
			vrednost=SecondDiscount();
		}
		else if(cart.getProducts().size()>=3 && date.getDayOfWeek().name()=="TUESDAY")
		{
			vrednost=FinalValue();
		}
		else
		{
			for(Product p:cart.getProducts())
			{
				p.setDiscountPerc(0);
				vrednost+=p.getPrice();
			}
			TotalDiscount=0;
			Total=vrednost;
			SubTotal=vrednost;
		}
		return vrednost;
	}
	
	public double getTotalDiscount() {
		return TotalDiscount;
	}
	public void setTotalDiscount(double totalDiscount) {
		TotalDiscount = totalDiscount;
	}
	public double getSubTotal() {
		return SubTotal;
	}
	public void setSubTotal(double subTotal) {
		SubTotal = subTotal;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
}
