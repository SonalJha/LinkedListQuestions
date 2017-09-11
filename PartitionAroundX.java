import java.util.Scanner;

public class PartitionAroundX {

	public static void main(String[] args) {
		LL ll = new LL();
		ll.insert(18);
		ll.insert(12);
		ll.insert(78);
		ll.insert(6);
		ll.insert(20);
		ll.insert(4);
		ll.insert(45);
		ll.insert(2);
		ll.insert(1);
		ll.display();
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		ll.head = partition(ll.head,x);
		ll.display();

	}

	private static Node partition(Node head, int x) {
		Node head1 = null;
		Node head2 = null;
		while(head!=null) {
			Node next = head.next;
			if(head.data<x) {
				head.next = head1;
				head1 = head;
			}
			else {
				head.next = head2;
				head2 = head;
			}
			head = next;
		}
		
		// now we have 2 lists with heads head1 and head2
		// traverse to the end of head1 and connect it with head2 and return head1
		if(head1==null)
			return head2;
		
		head = head1;
		
		while(head1.next!=null) {
			head1 = head1.next;
		}
		head1.next = head2;
		
		return head;
		
	}

}
