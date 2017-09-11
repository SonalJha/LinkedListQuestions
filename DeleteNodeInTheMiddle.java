
public class DeleteNodeInTheMiddle {

	public static void main(String[] args) {
		LL ll = new LL();
		ll.insert(18);
		ll.insert(12);
		ll.insert(8);
		ll.insert(6);
		Node d = ll.head;
		ll.insert(5);
		ll.insert(4);
		ll.insert(3);
		ll.insert(2);
		ll.insert(1);
		ll.display();
		deleteNodeFromMiddle(d);
		ll.display();


	}

	/** 
	 * Copy the content of the next node to d and then delete next
	 * wont work if d is the last node
	 * @param d
	 */
	private static void deleteNodeFromMiddle(Node d) {
		Node temp = d.next;
		d.data = temp.data;
		d.next = temp.next;
		temp.next = null;
		
	}

}
