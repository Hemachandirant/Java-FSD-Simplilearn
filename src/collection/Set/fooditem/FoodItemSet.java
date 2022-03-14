package collection.Set.fooditem;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FoodItemSet {

	public static void main(String[] args) {
		
		Set<FoodItem> fooditem = new LinkedHashSet<FoodItem>();
		
		fooditem.add(new FoodItem(11,"Chocolate",900,"Tasty and sweet"));
		fooditem.add(new FoodItem(12,"Chips",100,"Hot and cruncy"));
		fooditem.add(new FoodItem(13,"Honey",200,"Sweet"));
		fooditem.add(new FoodItem(14,"Fruits",500,"Tasty and Healthy"));
		fooditem.add(new FoodItem(15,"Vegetables",700,"Healthy"));
		
		
		System.out.println(fooditem);
		
		System.out.println("-------------------------------");
		
		for(FoodItem items:fooditem) {
			System.out.println(items);
		}
		System.out.println("------------------------------------");
		
		Iterator<FoodItem> itr = fooditem.iterator();
		while(itr.hasNext()) {
			FoodItem item = itr.next();
			System.out.println("ID : "+ item.ID);
			System.out.println("Name: "+item.Name);
			System.out.println("Desc : "+item.Desc);
			System.out.println("Price : "+item.Price);
			System.out.println("-------------------------");
		}

	}

}
