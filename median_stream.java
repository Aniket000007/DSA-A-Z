package codeforces;

import java.util.PriorityQueue;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> qu = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            qu.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++){
            if(qu.peek()<nums[i]){
                qu.remove();
                qu.add(nums[i]);
            }
        }
        return qu.peek();
    }

}
