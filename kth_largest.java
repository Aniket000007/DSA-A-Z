import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class kth_largest {

	public static void main(String[] args) {
        String []arr = {"tea", "ate", "anagram", "eat", "gramaan"};
        ArrayList<String> result = giveAnagramDad(arr);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
	}

    public static ArrayList<String> giveAnagramDad(String[] arr){
        ArrayList<String> ans = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String str = SortString(arr[i]);
            if(map.containsKey(str)){
            }else{
                ans.add(arr[i]);
                map.put(str,0);
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public static String SortString(String str){
        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        String sortedStr = new String(chars);
        return sortedStr;
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
        return qu.peek();//new
    }

}
