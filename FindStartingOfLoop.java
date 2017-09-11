
public class FindStartingOfLoop {

	public static void main(String[] args) {
		// Need to create and pass circular linked list

	}
	
	public Node findStartOfTheLoop(Node head) {
	    if(head==null || head.next==null || head.next.next==null)
	    return null;
	    Node fast = head.next.next;
	    Node slow = head.next;
		
		while(fast!=slow){
			if(fast==null || fast.next==null)
				return null;
			//System.out.println("slow= "+slow.data+ " fast = "+fast.data);
			fast = fast.next.next;
			slow = slow.next;
		}
		// when they meet loop is detected
		// the distance from head to begin and colision spot to begin is the same
		
		fast = head;
		while(fast!=slow) {
		  //  System.out.println("slow= "+slow.data+ " fast = "+fast.data);
			fast = fast.next;
			slow = slow.next;
		}
		
		return fast;
		//or slow
	}
	

}
