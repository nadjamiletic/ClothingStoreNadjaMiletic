import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		//Example 1
		String str = "2022-02-02 12:34:56";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
		Cart c1=new Cart();
		Shirts s1=new Shirts("Blue Cotton Shirt","BrandS",14.99,"blue","M");
		Shirts s2=new Shirts("White Cotton Shirt","BrandS",15.99,"white","M");
		Trousers t1=new Trousers("Black Cotton Trousers","BrandT",29.99,"black",50);
		Shoes sh1=new Shoes("Black Leather Shoes","BrandS",59.99,"black",43);
		Jackets j1=new Jackets("Black Cotton Suit Jacket","BrandJ",99.99,"black",50);
		
		c1.addProduct(s1);
		c1.addProduct(s2);
		c1.addProduct(t1);
		c1.addProduct(sh1);
		c1.addProduct(j1);
		Purchase p1=new Purchase(dateTime,c1);
		
		//Example 2
		String str1 = "2022-02-01 12:34:56";
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime1 = LocalDateTime.parse(str1, formatter1);
		Cart c2=new Cart();
		Shirts ps1=new Shirts("Black Silk Shirt","BrandS",29.99,"black","L");
		Shirts ps2=new Shirts("White Silk Shirt","BrandS",29.99,"white","L");
		c2.addProduct(ps1);
		c2.addProduct(ps2);
		Purchase p2= new Purchase(dateTime1,c2);
		
	
		//Example3
		Cart c3=new Cart();
		Trousers t2=new Trousers("Red Linen Trousers","BrandT",49.99,"red",56);
		Shoes sh2=new Shoes("Red Suede Shoes","BrandS",59.99,"red",44);
		Shoes sh3=new Shoes("Black Suede Shoes","BrandS",59.99,"black",44);
		Jackets j2=new Jackets("Red Linen Suit Jacket","BrandJ",99.99,"black",56);
		Shirts ps3=new Shirts("White Linen Shirt","BrandS",29.99,"white","L");
		c3.addProduct(t2);
		c3.addProduct(sh2);
		c3.addProduct(sh3);
		c3.addProduct(j2);
		c3.addProduct(ps3);
		Purchase p3=new Purchase(dateTime1,c3);
		
		
		Cashier cashier=new Cashier();
		cashier.addPurchase(p1);
		cashier.addPurchase(p2);
		cashier.addPurchase(p3);
		cashier.Print();
	
	}

}
