
public class ReverseLinkedList {
	
	/**
	 * Link: https://www.hackerrank.com/challenges/reverse-a-linked-list
	 * @param args
	 */

	public static void main(String[] args) {
		LL ll = new LL();
		ll.insert(18);
		ll.insert(12);
		ll.insert(7);
		ll.insert(6);
		ll.insert(5);
		ll.insert(4);
		ll.insert(3);
		ll.insert(2);
		ll.insert(1);
		ll.display();
		ll.head = reverse(ll.head);
		ll.display();

	}

	private static Node reverse(Node head) {
		if(head==null || head.next==null)
			return head;
		// Store the next
		// detach the current from next
		// pass next in recursion
		// get back head of the next list
		// connect next with head
		// return the new head
		Node next = head.next;
		head.next = null;
		Node temp = reverse(next);
		next.next = head;
		return temp;
	}

}
