//package codeforces;

import java.util.PriorityQueue;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(sumOfDigits("11111"));
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null||head.next==null){
            return null;
        }
        int size=0;
        int count=0;
        ListNode temp=head;
        ListNode curr = head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count-n==0){
            head=head.next;
            return head; 
        }
        while(curr!=null){
            size++;
            if(size==count-n){
                curr.next=curr.next.next;
                break;
            }
            curr=curr.next;
        }
        return head;
    }

}
