
public class DoubleLinkedListItem {
	private DoubleLinkedList nombre;
	private DoubleLinkedListItem next;
	private DoubleLinkedListItem previusly;
	
	
	public DoubleLinkedListItem() {
		super();
		this.nombre=null;
		this.next = null;
		this.previusly = null;
	}

	public void setNext (DoubleLinkedListItem next) {
		this.next = next;
	}
	
	public void setPreciusly (DoubleLinkedListItem previusly) {
		this.previusly = previusly;
	}
	
	public DoubleLinkedListItem getNext (DoubleLinkedListItem next) {
		return this.next;
	}
	
	public DoubleLinkedListItem getPreciusly (DoubleLinkedListItem previusly) {
		return this.previusly;
	}
	
	public DoubleLinkedList getList() {
		return this.nombre;
	}
	
	public void setList (DoubleLinkedList nombre) {
		this.nombre = nombre;
	}
	
}
