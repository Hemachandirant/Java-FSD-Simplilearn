package collection.Set.fooditem;

public class FoodItem {
	
	public int ID;
	public String Name;
	public long Price;
	public String Desc;
	
	
	public FoodItem(int iD, String name, long price, String desc) {
		this.ID = iD;
		this.Name = name;
		this.Price = price;
		this.Desc = desc;
	}


	@Override
	public String toString() {
		return "FoodItem [ID=" + ID + ", Name=" + Name + ", Price=" + Price + ", Desc=" + Desc + "]";
	}

}
