import java.util.Scanner;

public class KthLastElement {

	public static void main(String[] args) {
		LL ll = new LL();
		ll.insert(18);
		ll.insert(12);
		ll.insert(8);
		ll.insert(6);
		ll.insert(5);
		ll.insert(4);
		ll.insert(3);
		ll.insert(2);
		ll.insert(1);
		ll.display();
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		Node d = findKthLastElement(ll.head, k);
		System.out.println("The kth last node's data is "+d.data);

	}

	private static Node findKthLastElement(Node head, int k) {
		Node fast=head, slow= head;
		for(int i =0;i<k;i++) {
			if(fast==null)
				return null;
			fast = fast.next;
		}
		
		while(fast!=null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	
	

}
