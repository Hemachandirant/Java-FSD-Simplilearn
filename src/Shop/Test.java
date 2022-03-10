package Shop;

public class Test {
	public static void main(String[] args) {
		Shopmain shopmain = new Shopmain(1242, "Bread", 40);
		ShopOperation shopOperation = new ShopOperation();
		
		//sell
		shopOperation.sell(shopmain);
		
		//Buy
		shopOperation.buy(shopmain);
		
		//showProduct
		
		shopOperation.display(shopmain);
	}
}
