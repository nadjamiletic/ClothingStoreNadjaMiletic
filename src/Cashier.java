import java.util.ArrayList;

public class Cashier {
	private ArrayList<Purchase> purchase;

	public Cashier()
	{
		purchase=new ArrayList<Purchase>();
	}
	public void addPurchase(Purchase p)
	{
		purchase.add(p);
	}
	
	public ArrayList<Purchase> getPurchase() {
		return purchase;
	}

	public void setPurchase(ArrayList<Purchase> purchase) {
		this.purchase = purchase;
	}
	
	public void Print()
	{
		for(Purchase pu:purchase)
		{
			System.out.println("Date: " + pu.getDate());
			System.out.println("---Products---");
			System.out.println();
			System.out.println();
			pu.Total();
		for(Product p:pu.getCart().getProducts())
		{
			System.out.println(p.Name +" "+p.Brand);
			//System.out.println();
			System.out.println("$"+p.Price);
			System.out.println("#discount "+p.getDiscountPerc()+"% -$"+Math.round(p.getamountOfDiscount()*100.0)/100.0);	
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("SUBTOTAL: $"+Math.round(pu.getSubTotal()*100.0)/100.0);
		System.out.println("DISCOUNT: -$"+Math.round(pu.getTotalDiscount()*100.0)/100.0);
		System.out.println();
		System.out.println("TOTAL: $"+ Math.round(pu.Total()*100.0)/100.0);
		System.out.println();
		System.out.println();
		}
	}
	
	public void Print(Purchase pu)
	{
		System.out.println("Date: " + pu.getDate());
		System.out.println("---Products---");
		System.out.println();
		System.out.println();
		pu.Total();
		for(Product p:pu.getCart().getProducts())
		{
			System.out.println(p.Name +" "+p.Brand);
			//System.out.println();
			System.out.println("$"+p.Price);
			System.out.println("#discount "+p.getDiscountPerc()+"% -$"+Math.round(p.getamountOfDiscount()*100.0)/100.0);	
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("SUBTOTAL: $"+Math.round(pu.getSubTotal()*100.0)/100.0);
		System.out.println("DISCOUNT: -$"+Math.round(pu.getTotalDiscount()*100.0)/100.0);
		System.out.println();
		System.out.println("TOTAL: $"+ Math.round(pu.Total()*100.0)/100.0);
		System.out.println();
		System.out.println();
		
	}
}
