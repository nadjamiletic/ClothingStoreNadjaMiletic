
public class Shoes extends Product{
	
	    private int Size; //39-46
	    
	    public Shoes()
	    {
	    }
	    
	    public Shoes(String name,String brand, double price, String color, int size)
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
