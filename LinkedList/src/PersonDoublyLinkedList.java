
public class PersonDoublyLinkedList {
	public Person element;
	 PersonDoublyLinkedList  prev, next;
	 
	public PersonDoublyLinkedList(Person person) {
		this.element = person;
		//PersonDoublyLinkedList next;
		//PersonDoublyLinkedList prev;
	}
	public boolean isEmpty() {
		return next == null;
	}
	public void link(PersonDoublyLinkedList next) {
		if (next != this && prev != this) {
		this.prev = prev;
		this.next = next;	
		}
	}	
	public void insert(PersonDoublyLinkedList newNext){
		newNext.link(this.next);
		this.link(newNext);
		
	}
	public boolean isEnd() {
		return this.next == null;
	}
	public boolean isStart() {
		return this.prev == null;
	}

}
