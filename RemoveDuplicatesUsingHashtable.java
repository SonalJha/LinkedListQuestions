import java.util.Hashtable;


public class RemoveDuplicatesUsingHashtable {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL ll = new LL();
		ll.insert(12);
		ll.insert(4);
		ll.insert(4);
		ll.insert(6);
		ll.insert(4);
		ll.insert(6);
		ll.insert(1);
		ll.display();
		removeDuplicates(ll.head);
		ll.display();

	}

	private static void removeDuplicates(Node head) {
		// using temporary storage (Hash table)
		Hashtable<Integer, Integer> hashtable = new Hashtable();
		Node prev = null;
		while(head!=null) {
			if(hashtable.containsKey(head.data)) {
				// we need to delete the node
				prev.next = head.next;
				Node temp = head;
				head = head.next;
				temp.next = null;
			}
			else {
				hashtable.put(head.data, head.data);
				prev = head;
				head = head.next;
			}
			
		}
	}

}
