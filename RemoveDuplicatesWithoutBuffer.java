
public class RemoveDuplicatesWithoutBuffer {

	public static void main(String[] args) {
		LL ll = new LL();
		ll.insert(12);
		ll.insert(12);
		ll.insert(4);
		ll.insert(4);
		ll.insert(6);
		ll.insert(4);
		ll.insert(6);
		ll.insert(1);
		ll.insert(1);
		ll.display();
		removeDuplicates(ll.head);
		ll.display();

	}

	private static void removeDuplicates(Node head) {
		Node prev = null, runner=head;
		while(head !=null && head.next!=null) {
			prev = head;
			runner = head.next;
			while(runner!=null) {
				if(head.data == runner.data){
					// delete the node
					Node temp = runner;
					prev.next = runner.next;
					runner = runner.next;
					temp.next = null;
				}
				else {
					prev = runner;
					runner = runner.next;
					
				}
			}
			head = head.next;
		}
		
	}

}
