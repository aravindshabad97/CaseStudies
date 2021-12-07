package oops3.cs1;

public class ItemTypeBO {

	public void add(ItemType object, ItemType[] itemTypeArray, Integer index) {
		itemTypeArray[index] = object;
		System.out.println("** Item Added Sucessfully **");
	}

	public void search(String search, ItemType[] itemTypeArray) {

		boolean flag = false;

		for (int i = 0; i < itemTypeArray.length; i++) {
			if (itemTypeArray[i].getName().equals(search)) {
				flag = true;
				System.out.println("** Item Found **");
				System.out.println(itemTypeArray[i]);
			}
		}
		if (flag == false)
			System.out.println("** Search Item not found **");

	}

	public void display(ItemType[] itemTypeArray) {

		for (int i = 0; i < itemTypeArray.length; i++) {
			System.out.println("Item Type Number :" + (i + 1));
			System.out.println(itemTypeArray[i]);
		}
	}

}