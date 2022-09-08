
public class DoubleLinkedList {
	private DoubleLinkedListItem first;
	private DoubleLinkedListItem last;
	
	public DoubleLinkedList() {
		super();
		this.first = null;
		this.last = null;
	}
	
	public void AddFirst(DoubleLinkedListItem item) {
		if (this.first==null) {
			this.first=item;
			this.last=item;
			
			item.setNext(item);
			item.setPreciusly(item);
		}
		
		else {
			item.setNext(first);
			item.setPreciusly(last);
			last.setNext(item);
			first.setPreciusly(item);
			this.first=item;
		}
	}
	
	public void AddLast(DoubleLinkedListItem item) {
		if (this.first==null) {
			this.first=item;
			this.last=item;
			
			item.setNext(item);
			item.setPreciusly(item);
		}
		
		else {
			item.setNext(first);
			item.setPreciusly(last);
			last.setNext(item);
			first.setPreciusly(item);
			this.last=item;
		}		
		
		
		
	}

}
