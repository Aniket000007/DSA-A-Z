package codeforces;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert2binary(13));
	}
	
	public static String convert2binary(int n) {
		String ans="";
		
		while(n!=1) {
			if(n%2==1) {
				ans+="1";
			}else {
				ans+="0";
			}
			n=n/2;
		}
		ans+="1";
		StringBuilder rev_ans = new StringBuilder();
        rev_ans.append(ans);
        rev_ans.reverse();
		return rev_ans.toString();
	}

}
