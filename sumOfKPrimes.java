import java.util.ArrayList;

public class sumOfKPrimes {

    public static void main(String[] args) {
        boolean result = isSumOfKprimes(4,2);
        System.out.println(result);
    }

    static boolean isSumOfKprimes(int N, int K) {
        // Code here
        if(N<2*K){
            return false;
        }

        if(K==1){
            if(!checkPrime(N)){
                return false;
            }
        }

        if(K==2){
            if(N%2!=0){
                if(!checkPrime(N-2)){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkPrime(int x){
        for (int i = 2; i * i <= x; i++)
            if (x % i == 0)
                return false;
        return true;
    }
}
