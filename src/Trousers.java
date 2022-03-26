
public class Trousers extends Product {

	private int Size; //42-66
	
	public Trousers()
	{
		
	}

	public Trousers(String name,String brand, double price, String color, int size)
	{
		super(name,brand,price,color);
    	this.Size=size;
	}
	
	public int getSize() {
		return Size;
	}

	public void setSize(int size) {
		Size = size;
	}
}
