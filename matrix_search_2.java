package codeforces;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans = 0;
         
        for(int i=0;i<n;i++){
            if(matrix[i][m-1]>=target && matrix[i][0]<=target){
                System.out.print(i);
                ans =  search(matrix[i],target);
                if(ans==1){
                    return true;
                }
            }
        }
        return false;
    }

    public static int search(int[] arr , int target){
        int low = 0;
        int high = arr.length-1;
        int ans=0;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                ans=1;
                break;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }

}
