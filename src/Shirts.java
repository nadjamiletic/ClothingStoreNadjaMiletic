
public class Shirts extends Product{
    enum Size {
    XS,
    S,
    M,
    L,
    XL,
    XXL
  }
    
    private Size size;
    private String sizes;
    
    public Shirts()
    {
    	
    }
    public Shirts(String name,String brand, double price, String color, Size size)
    {
    	super(name,brand,price,color);
    	this.size=size;
    	
    }
    
    public Shirts(String name,String brand, double price, String color, String size)
    {
    	super(name,brand,price,color);
    	this.setSizes(size);
    	
    }
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public String getSizes() {
		return sizes;
	}
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}
}