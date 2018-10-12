
public class PersonDoublyLinkedList {
	
	public Person element;
	 PersonDoublyLinkedList  prev, next;
	 
	 // Creates a person object with an actual person object inside which we can access via PersonDoublyLinkedList instance . element
	public PersonDoublyLinkedList(Person person) {
		this.element = person;
		//PersonDoublyLinkedList next;
		//PersonDoublyLinkedList prev;
	}
	

	//Im unable to understand how to actually link them together I think I would need to save need to save next to refer back to it e.g. tempnext to go back to and make it prev
	public void link(PersonDoublyLinkedList next) {
		if (next != this && prev != this) {
		this.next = next;
	
		//next = this.prev;
		}
	}
	
	
	public void insert(PersonDoublyLinkedList newNext){
		newNext.link(this.next);
		this.link(newNext);
		
	}
	
	
	//Code should stay the same for is end and just change isStart to this.prev
	public boolean isEnd() {
		return this.next == null;
	}
	public boolean isStart() {
		return this.prev == null;
	}

}
