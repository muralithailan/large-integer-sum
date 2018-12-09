package addition;

public class LinkedListAddition {

	public static void main(String[] args) {
		LinkedListAddition x = new LinkedListAddition();
		ListNode l1 = x.new ListNode(2);
		l1.next = x.new ListNode(4);
		l1.next.next = x.new ListNode(3);
		
		ListNode l2 = x.new ListNode(5);
		l2.next = x.new ListNode(6);
		l2.next.next = x.new ListNode(4);
		ListNode o = x.addTwoNumbers(l1,l2);
		while(o!=null) {
			System.out.println(o.val);
			o=o.next;
		}
		

	}
	
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode out=new ListNode(0);
        int carry=0;
        ListNode n = out;
        while(l1!=null || l2!= null){
        	
        	int x = l1 !=null ? l1.val:0;
        	int y = l2 !=null ? l2.val:0;
            int sum = x + y +carry;
            carry = sum/10;
            sum = sum%10;
            n.next = new ListNode(sum);
            n = n.next;
            
            if (l1!=null)l1 = l1.next;
            if (l2!=null)l2 = l2.next;
        }
        if(carry != 0){
        	n.next = new ListNode(carry);
            
        }
        out =out.next;
        return out;
    }
    
	public void addNode(ListNode out, int sum) {
		if (out != null) {

			ListNode n = out;
			while (n.next != null) {
				n = n.next;
			}
			n.next = new ListNode(sum);
		}

	}

}

    
