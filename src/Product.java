public class Product {
    
    protected String Name;
    protected String Brand; 
    protected double Price; //currency
    protected String Color; 
    protected double amountOfDiscount;
    protected int DiscountPerc;
    public Product()
    {
        Name="";
        Brand="";
        Price=0;
        Color="";
    }
    public int getDiscountPerc()
    {
    	return DiscountPerc;
    }
    
    public void setDiscountPerc(int discount)
    {
    	DiscountPerc=discount;
    }
    public Product(String name,String brand, double price, String color)
    {
        Name=name;
        Brand=brand;
        Price=price;
        Color=color;
    }
    public double getamountOfDiscount()
    {
    	return amountOfDiscount;
    }
    
    public void setamountOfDiscount(double amount)
    {
    	amountOfDiscount=amount;
    }
    public String getName()
    {
        return Name;
    }
    
    public String getBrand()
    {
        return Brand;
    }
    
    public String getColor()
    {
        return Color;
    }
    public double getPrice()
    {
        return Price;
    }
    
    public void setName(String name)
    {
        Name=name;
    }
    
    public void setBrand(String brand)
    {
        Brand=brand;
    }
    public void setColor(String color)
    {
        Color=color;
    }
    public void setPrice(double price)
    {
        Price=price;
    }
}