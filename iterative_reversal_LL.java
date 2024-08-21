//package codeforces;

import java.util.PriorityQueue;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits("11111"));
	}
	
	public ListNode reverseList(ListNode head) {
        
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev = null;
        ListNode temp = head;
        ListNode front = null;
        while(temp!=null){
            front = temp.next;
            temp.next = prev;
            prev=temp;
            temp=front;
        }
        head=prev;
        return head;
    }

}
