package Shop;

public class ShopOperation {
	
	// buy
	public void buy(Shopmain shopmain) {
		if(shopmain.Price!=0) {
			System.out.println("The Product "+shopmain.ProductName +" with productID "+shopmain.productID+" of price "+shopmain.Price+" is bought");
			
		}
	}
	//sell
		
		public void sell(Shopmain shopmain) {
			if(shopmain.Price!=0) {
				System.out.println("The Product "+shopmain.ProductName +" with productID "+shopmain.productID+" of price "+shopmain.Price+" is sold");
				
				
			}
		}
	//display Product
			
		public void display(Shopmain shopmain) {
			System.out.println("Product Name: "+shopmain.ProductName+" Product ID "+shopmain.productID+" Price: "+shopmain.Price);
			
		}

}
	
