
public class PersonLinkedList {

	public Person element;
	public PersonLinkedList next = null;

	public PersonLinkedList(Person person) {
	this.element = person;
	}

	public void link(PersonLinkedList next) {
		if (next != this)
			this.next = next;
	}

	public boolean isEnd() {
		return this.next == null;
	}
	
	public void insert(PersonLinkedList newNext){
		newNext.link(this.next);
		this.link(newNext);
		
		//this.next.link(newNext);	
		
	}

}
