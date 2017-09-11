import java.util.Stack;

public class DetectPalindromeLL {

	public static void main(String[] args) {
		LL ll = new LL();
		ll.insert(1);
		ll.insert(1);
		ll.insert(2);
		ll.insert(1);
		ll.insert(1);
		ll.display();
		boolean flag = isPalindrome(ll.head);
		if(flag) {
			System.out.println("Yes the given linkedlist is palindrome");
		}
		else {
			System.out.println("No the given linkedlist is not palindrome");
		}
	}

	private static boolean isPalindrome(Node head) {
		// Always remember palindrome means stack
		if(head==null)
			return false;
		if(head.next==null)
			return true;
		
		Stack<Integer> s = new Stack<Integer>();
		Node fast= head, slow = head;
		while(fast!=null && fast.next!=null) {
			s.push(slow.data);
			fast = fast.next.next;
			slow = slow.next;
		}
		// check if odd numbered list
		if(fast!=null) {
			slow = slow.next;
		}
		// start popping fromt the stack
		
		while(slow!=null) {
			int d = s.pop();
			if(d!=slow.data)
				return false;
			slow = slow.next;
		}
		return true;
	}

}
