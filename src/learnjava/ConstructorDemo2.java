package learnjava;
class Item{
	int itemNum;
	String itemName;
	Item(int itemNum, String itemName){
		this.itemNum = itemNum;
		this.itemName =itemName;
	}
	Item(){}
	void display() {
		System.out.println("Item Num : "+itemNum);
		System.out.println("Item Name : "+itemName);
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = new Item(111,"Kaushik");
		item1.display();
		Item item2 = new Item();
		item2.display();
	}

}
