
public class LinkedListTest {

	public static void main(String[] args) {

		/*PersonLinkedList item1 = new PersonLinkedList(new Person("Bob", 42));
		PersonLinkedList item2 = new PersonLinkedList(new Person("james", 21));
		PersonLinkedList item3 = new PersonLinkedList(new Person("tim", 19));
		PersonLinkedList item4 = new PersonLinkedList(new Person("Robert", 97));
		PersonLinkedList item5 = new PersonLinkedList(new Person("apple", 32));*/
		
		PersonDoublyLinkedList item1 = new PersonDoublyLinkedList(new Person("Bob", 42));
		PersonDoublyLinkedList item2 = new PersonDoublyLinkedList(new Person("james", 21));
		PersonDoublyLinkedList item3 = new PersonDoublyLinkedList(new Person("tim", 19));
		PersonDoublyLinkedList item4 = new PersonDoublyLinkedList(new Person("Robert", 97));
		PersonDoublyLinkedList item5 = new PersonDoublyLinkedList(new Person("apple", 32));
		
		item1.link(item2);
		item2.link(item3);
		item3.link(item4);
		item4.link(item5);
		int size = countListItems(item1);
		System.out.println("--" +size + " elements. Avg Age ="+avgAges(item1, size));
		System.out.println("-----------------------");
		
		printList(item1);
		System.out.println("-----------------------");
		
		printListItem(item1 , 0);	
		System.out.println("-----------------------");
		
		PersonDoublyLinkedList newitem = new PersonDoublyLinkedList(new Person("Patrick", 21));
		//item3.insert(newitem);
		printList(item1);
		System.out.println("-----------------------");
		size = countListItems(item1);
		System.out.println("--" + size + " elements. Avg Age ="+avgAges(item1, size));
		System.out.println("-----------------------");
		printListBackwards(item4);
	}
	public static void printList(PersonDoublyLinkedList list) {
		while(list.next != null){
			
			System.out.println(list.element.name + " (" + list.element.age + ")");
			list = list.next;
		}
		System.out.println(list.element.name + " (" + list.element.age + ")");
	}
	
	public static void printListBackwards(PersonDoublyLinkedList list) {
		while(list.prev != null){
			System.out.println("wdadwa");
			System.out.println(list.element.name + " (" + list.element.age + ")");
			list = list.prev;
		}
		System.out.println(list.element.name + " (" + list.element.age + ")");
	}
	
	
	public static void printListItem(PersonDoublyLinkedList list, int position) {
		
		int increment = 0;
		while(list.next != null){
			if(increment == position) {
				System.out.println(list.element.name + " (" + list.element.age + ")");
			}
			list = list.next;
			increment++;
		}
		if(increment == position) {
			System.out.println(list.element.name + " (" + list.element.age + ")");
		}
		list = list.next;
		increment++;
		
	}
	
	
	public static int countListItems(PersonDoublyLinkedList list) {
		int increment = 0;
		while(list.next != null){
			list = list.next;
			increment++;
		}
		list = list.next;
		increment++;
		return increment;
	}
	
	public static int avgAges(PersonDoublyLinkedList list, int size) {
		
		int increment = 0;
		int[] intArray = new int[size];
		while(list.next != null){
			intArray[increment] = list.element.age;
			list = list.next;
			increment++;
		}
		intArray[increment] = list.element.age;
		list = list.next;
		increment++;
		int tempint = 0;
		for(int i = 0; i < intArray.length; i++) {
			tempint += intArray[i];	
		}
		tempint = tempint / intArray.length;
		return tempint;
	}
}
