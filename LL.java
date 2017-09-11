
public class LL {
	
	public Node head = null;
	
	public void insert(int val){
		Node temp = new Node(val);
		if(head!=null){
			temp.next = head;
		}
		head = temp;
	}
	
	public void display() {
		Node temp = head;
		System.out.println();
		System.out.println("The contents of the linked list are ");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}


}

